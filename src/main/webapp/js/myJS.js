/**
 * 
 */
$(document).ready(function(){
    $('[data-toggle="popover"]').popover(); 
});

//-------------------------------------------------
//Button deconnexion

$("#btnDeconnect").click(function(){
    $.ajax({
        url : 'start',
        method : 'GET',
        async : false,
        complete : function(data) {
            console.log(data.responseText);
        }
    });

});