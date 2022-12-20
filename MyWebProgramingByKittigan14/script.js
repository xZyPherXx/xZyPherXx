$(document).ready(function() {

    var menu = $(".Menu");
    var main = $(".Main");
    // var line = $(".line");
    var menuOpen;

    function openMenu() {
        menu.css("left" , "0px");
        line.css("background" , "#000000");
        menuOpen = true
    }

    function closeMenu() {
        menu.css("left" , "-320px");
        line.css("background" , "#F5F5DC");
        menuOpen = false
    }

    function toggleMenu() {
        if (menuOpen) {
            closeMenu();
        }

        else {
            openMenu();
        }
    }

    main.on({
        mouseenter: function() {
            openMenu();
        }
    });

    menu.on({
        mouseleave: function() {
            closeMenu();
        }
    })

    main.on({
        click: function() {
            toggleMenu();
        }
    })

});