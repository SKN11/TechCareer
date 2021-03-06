from rest_framework import serializers
from store.models import Product,ShoppingCart,ShoppingCartItem


class CartItemSerializer(serializers.ModelSerializer):
    quantity = serializers.IntegerField(min_value=1,max_value=100)
    
    class Meta:
        model = ShoppingCartItem
        fields = ('product','quantity')




class ProductSerializer(serializers.ModelSerializer):
    is_on_sale = serializers.BooleanField(read_only=True)
    current_price = serializers.FloatField(read_only=True)
    description = serializers.CharField(min_length=2,max_length=100)
    cart_items = serializers.SerializerMethodField()
    price = serializers.DecimalField(min_value=1.00,max_value=100000,
        max_digits=None,decimal_places=2)
    sale_start = serializers.DateTimeField(
        input_formats =['%I:%M %p %d %B %Y'],
        format=None,
        allow_null=True,
        help_text='Accepted Format is "12:00 PM 16 April 2019"',
        style={'input_type':'text','placeholder':'12:00 PM 16 April 2019'}
    )

    sale_end = serializers.DateTimeField(
        input_formats =['%I:%M %p %d %B %Y'],
        format=None,
        allow_null=True,
        help_text='Accepted Format is "12:00 PM 16 April 2019"',
        style={'input_type':'text','placeholder':'12:00 PM 16 April 2019'}
    )

    class Meta:
        model = Product
        fields = ('id','name','description','price','sale_start','sale_end','is_on_sale','current_price','cart_items')

    
    def get_cart_items(self,instance):
        items = ShoppingCartItem.objects.filter(product=instance)
        return CartItemSerializer(items,many=True).data

    '''
    def to_representation(self,instance):
        data = super().to_representation(instance)
        data['is_on_sale'] = instance.is_on_sale()
        data['current_price'] = instance.current_price()
        return data
    '''
    '''
    import json
    from store.models import *
    from store.serializers import *
    product = Product.objects.all().first()
    cart = ShoppingCart()
    cart.save()
    item = ShoppingCartItem(shopping_cart=cart,product=product,quantity=5)
    item.save()
    serializer = ProductSerializer(product)
    print(json.dumps(serializer.data,indent=2))
    '''