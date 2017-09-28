/**
 * Created by mega on 28.09.17.
 */

$(function () {
    $('.edit').keypress(function (e) {
        if(e.which == 13) {
            return false;
        }
    });
});