from store.models import Product
from rest_framework.generics import ListAPIView,CreateAPIView
from django_filters.rest_framework import DjangoFilterBackend
from rest_framework.filters import SearchFilter
from rest_framework.pagination import LimitOffsetPagination 
from rest_framework.exceptions import ValidationError

from store.serializers import ProductSerializer


class ProductPagination(LimitOffsetPagination):
    default_limit=10
    max_limit=100


class ProductList(ListAPIView):
    queryset = Product.objects.all()
    serializer_class = ProductSerializer
    filter_backends = (DjangoFilterBackend,SearchFilter)
    filter_fields = ('id',)  #model field based filter
    search_fields = ('name','description')  #text based filters
    pagination_class = ProductPagination   #pagination


    def get_queryset(self):     #overriding queryset method
        on_sale = self.request.query_params.get('on_sale',None)
        if on_sale is None:
            return super().get_queryset()
        queryset = Product.objects.all()
        if on_sale.lower() == "true":
            from django.utils import timezone
            now = timezone.now()
            return queryset.filter(
                sale_start__lte=now,
                sale_end__gte=now,
            )
        return queryset


class ProductCreate(CreateAPIView):
    serializer_class = ProductSerializer

    def create(self,request,*args,**kwargs):
        try:
            price = request.data.get('price')
            if price is not None and float(price) <= 0.0:
                raise ValidationError({'price' : 'Must be greater than 0'})
        except ValueError:
            raise ValidationError({'price' : 'Must be valid integer'})
        return super().create(request,*args,**kwargs)

