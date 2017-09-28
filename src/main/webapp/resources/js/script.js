/**
 * Created by mega on 28.09.17.
 */

$(function () {

    let oldVal, newVal, id;

    $('.edit').keypress(function (e) {
        if(e.which == 13) {
            return false;
        }
    });

    $('.edit').focus(function () {
        oldVal = $(this).text();
        id = $(this).data('id');
    }).blur(function () {
        newVal = $(this).text();
        if(oldVal != newVal) {
            $.ajax({
                url: 'updateAgax',
                type: 'GET',
                data: {new_val: newVal, id: id},
                success: function (res) {
                    console.log(res);
                },
                error: function () {
                    alert('AJAX ERROR !');
                }
            })
        }
    });

});