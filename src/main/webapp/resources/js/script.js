/**
 * Created by mega on 28.09.17.
 */

$(function () {

    let oldVal, newVal, id, field;
    let arr = [];

    $('.edit').keypress(function (e) {
        if(e.which == 13) {
            return false;
        }
    });

    $('.edit').focus(function () {
        oldVal = $(this).text();
        id = $(this).data('id');
        field = $(this).data('name');
    }).blur(function () {
        newVal = $(this).text();
        if(oldVal != newVal) {
            let toPush = {"id": id, "field": field, "newVal": newVal};
            arr.push(toPush);
        }
    });




    $('#update').click(function () {
        if(arr.length != 0) {
            $.ajax({
                url: 'updateAgax',
                type: 'POST',
                contentType: 'application/json',
                data: JSON.stringify(arr),
                success: function (res) {
                    console.log(res);
                    arr = [];
                },
                error: function () {
                    alert('AJAX ERROR !');
                }
            });
        }
    })


});