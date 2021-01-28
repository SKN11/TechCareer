from django.conf import settings
from django.conf.urls.static import static
from django.contrib import admin
from django.urls import path
import store.api_view 

import store.views

urlpatterns = [
    path('api/v1/products/',store.api_view.ProductList.as_view()),   #class based view synatx
    path('api/v1/products/new',store.api_view.ProductCreate.as_view()),
    #path('api/v1/products/<int:id>/destroy',store.api_view.ProductDestroy.as_view()),  
    path('api/v1/products/<int:id>/',store.api_view.ProductRetrieveUpdateDestroy.as_view()),  

    path('admin/', admin.site.urls),
    path('products/<int:id>/', store.views.show, name='show-product'),
    path('cart/', store.views.cart, name='shopping-cart'),
    path('', store.views.index, name='list-products'),
] + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
