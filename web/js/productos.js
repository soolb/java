$(document).ready(function () {
    $.ajax({
        type: "get",
        url: "productosServlet",
        async: true,
        cache: false,
        dateType: "json",
        success: function (listaDeProductosDescatacados) {
            console.log(listaDeProductosDescatacados);
            for (let productoDestacado of listaDeProductosDescatacados) {
                $(".productos").append("<div class='card col-3 carta' style='width: 18rem;'>" +
                        
                        "<img class='card-img-top imagenes' src='imagenes agus/productos/"+productoDestacado._idImagen+".jpg' alt='Card image cap'>" +
                        
                        "<div class= 'card-body'>" +
                        "<h5 class='card-title'>"+ productoDestacado._nombre +"</h5>" +
                        "<p class='card-text'>"+ productoDestacado._precio +"</p>" +
                        " <a href='#' class='btn btn-primary'>COMPRAR</a>" +
                        " </div>" +
                        "</div>");
            }
        }
    });


});

