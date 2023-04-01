'use strict';

(function ($) {
    /*------------------
        Preloader
    --------------------*/
    $(window).on('load', function () {
        $(".loader").fadeOut();
        $("#preloder").delay(200).fadeOut("slow");
    });

    /*------------------
          Gallery filter
      --------------------*/

    $('.featured__controls li').on('click', function () {
        $('.featured__controls li').removeClass('active');
        $(this).addClass('active');
    });
    if ($('.featured__filter').length > 0) {
        // var containerEl = document.querySelector('.featured__filter');
        // mixitup(containerEl);
        var containerEl = document.querySelector('.featured__filter');
        var mixer = mixitup(containerEl, {
            selectors: {
                control: '[data-mixitup-control]'
            }
        });
    }



    /*------------------
        Background Set
    --------------------*/
    $('.set-bg').each(function () {
        var bg = $(this).data('setbg');
        $(this).css('background-image', 'url(' + bg + ')');
    });

    //Humberger Menu
    $(".humberger__open").on('click', function () {
        $(".humberger__menu__wrapper").addClass("show__humberger__menu__wrapper");
        $(".humberger__menu__overlay").addClass("active");
        $("body").addClass("over_hid");
    });

    $(".humberger__menu__overlay").on('click', function () {
        $(".humberger__menu__wrapper").removeClass("show__humberger__menu__wrapper");
        $(".humberger__menu__overlay").removeClass("active");
        $("body").removeClass("over_hid");
    });

    /*------------------
		Navigation
	--------------------*/
    $(".mobile-menu").slicknav({
        prependTo: '#mobile-menu-wrap',
        allowParentLinks: true
    });

    /*-----------------------
        banner header Slider
    ------------------------*/
    $(".banner__slider").owlCarousel({
        loop: true,
        margin: 0,
        items: 1,
        dots: false,
        nav: true,
        navText: ["<span class='fa fa-angle-left'><span/>", "<span class='fa fa-angle-right'><span/>"],
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: true,
        animateOut: 'fadeOut'
    });

    /*-----------------------
        banner2 header Slider
    ------------------------*/
    $(".banner2__slider").owlCarousel({
        loop: true,
        margin: 0,
        items: 1,
        dots: false,
        nav: true,
        navText: ["<span class='fa fa-angle-left'><span/>", "<span class='fa fa-angle-right'><span/>"],
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: true,
        animateOut: 'fadeOut'
    });
    /*-----------------------
        banner3 header Slider
    ------------------------*/
    $(".banner3__slider").owlCarousel({
        loop: true,
        margin: 0,
        items: 1,
        dots: false,
        nav: true,
        navText: ["<span class='fa fa-angle-left'><span/>", "<span class='fa fa-angle-right'><span/>"],
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: true,
        animateOut: 'fadeOut'
    });

    /*-----------------------
        banner4 header Slider
    ------------------------*/
    $(".banner4__slider").owlCarousel({
        loop: true,
        margin: 10,
        items: 1,
        dots: false,
        nav: true,
        navText: ["<span class='fa fa-angle-left'><span/>", "<span class='fa fa-angle-right'><span/>"],
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: false,
    });

    /*-----------------------
        banner5 header Slider
    ------------------------*/
    $(".banner5__slider").owlCarousel({
        loop: true,
        margin: 5,
        items: 9,
        dots: false,
        nav: true,
        navText: ["<span class='fa fa-angle-left'><span/>", "<span class='fa fa-angle-right'><span/>"],
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: false,
        touchDrag: false,
        mouseDrag: false,
        responsive: {
            320: {
                items: 4,
            },

            480: {
                items: 5,
            },

            768: {
                items: 7,
            },

            992: {
                items: 9,
            }
        }
    });

    /*-----------------------
        partner Slider
    ------------------------*/
    $(".partner__slider").owlCarousel({
        loop: true,
        margin: 0,
        items: 5,
        dots: false,
        nav: true,
        navText: ["<span class='fa fa-angle-left'><span/>", "<span class='fa fa-angle-right'><span/>"],
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: true,
        responsive: {

            0: {
                items: 2,
            },

            480: {
                items: 2,
            },

            768: {
                items: 3,
            },

            992: {
                items: 5,
            }
        }
    });

    /*-----------------------
        Categories Slider
    ------------------------*/
    $(".categories__slider").owlCarousel({
        loop: true,
        margin: 0,
        items: 4,
        dots: false,
        nav: true,
        navText: ["<span class='fa fa-angle-left'><span/>", "<span class='fa fa-angle-right'><span/>"],
        animateOut: 'fadeOut',
        animateIn: 'fadeIn',
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: false,
        responsive: {
            0: {
                items: 1,
            },

            480: {
                items: 2,
            },

            768: {
                items: 3,
            },

            992: {
                items: 4,
            }
        }
    });

    // onclick show element
    $('.hero__categories__all').on('click', function () {
        $('.hero__categories ul').slideToggle(200);
    });

    $(".nav-item .nav-link").click(function () {
        $('.nav-item .nav-link').removeClass('active');
    });
    /*--------------------------
        Latest Product Slider
    ----------------------------*/
    $(".latest-product__slider").owlCarousel({
        loop: true,
        margin: 0,
        items: 1,
        dots: false,
        nav: true,
        navText: ["<span class='fa fa-angle-left'><span/>", "<span class='fa fa-angle-right'><span/>"],
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: true
    });

    /*-----------------------------
        Product Discount Slider
    -------------------------------*/
    $(".product__discount__slider").owlCarousel({
        loop: true,
        margin: 0,
        items: 3,
        dots: true,
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: true,
        responsive: {

            320: {
                items: 1,
            },

            480: {
                items: 2,
            },

            768: {
                items: 2,
            },

            992: {
                items: 3,
            }
        }
    });
    /*---------------------------------
        Product Details Pic Slider
    ----------------------------------*/
    $(".product__details__pic__slider").owlCarousel({
        loop: true,
        margin: 20,
        items: 4,
        dots: true,
        smartSpeed: 1200,
        autoHeight: false,
        autoplay: true
    });
    /*-----------------------
		Price Range Slider
	------------------------ */
    var rangeSlider = $(".price-range"),
        minamount = $("#minamount"),
        maxamount = $("#maxamount"),
        minPrice = rangeSlider.data('min'),
        maxPrice = rangeSlider.data('max');
    rangeSlider.slider({

        range: true,
        min: minPrice,
        max: maxPrice,
        values: [minPrice, maxPrice],
        slide: function (event, ui) {
            minamount.val(ui.values[0] + '.000VNĐ' );
            maxamount.val(ui.values[1] + '.000VNĐ');
        }
    });
    minamount.val(rangeSlider.slider("values", 0) + '.000VNĐ' );
    maxamount.val(rangeSlider.slider("values", 1) + '.000VNĐ' );
    /*--------------------------
        Select
    ----------------------------*/
    $("select").niceSelect();

    /*------------------
		Single Product
	--------------------*/
    $('.product__details__pic__slider img').on('click', function () {

        var imgurl = $(this).data('imgbigurl');
        var bigImg = $('.product__details__pic__item--large').attr('src');
        if (imgurl != bigImg) {
            $('.product__details__pic__item--large').attr({
                src: imgurl
            });
        }
    });
    /*-------------------
		Quantity change
	--------------------- */
    var proQty = $('.pro-qty');
    // proQty.prepend('<span class="dec qtybtn">-</span>');
    // proQty.append('<span class="inc qtybtn">+</span>');
    proQty.on('click', '.qtybtn', function () {
        var $button = $(this);
        var oldValue = $button.parent().find('input').val();
        if ($button.hasClass('inc')) {
            var newVal = parseFloat(oldValue) + 1;
        } else {
            // Don't allow decrementing below zero
            if (oldValue > 0) {
                var newVal = parseFloat(oldValue) - 1;
            } else {
                newVal = 0;
            }
        }
        $button.parent().find('input').val(newVal);
    });
})(jQuery);


// timer countdown{
function el(){
    (function () {
        const second = 1000,
            minute = second * 60,
            hour = minute * 60,
            day = hour * 24;
    
        //I'm adding this section so I don't have to keep updating this pen every year :-)
        //remove this if you don't need it
        let today = new Date(),
            dd = String(today.getDate()).padStart(2, "0"),
            mm = String(today.getMonth() + 1).padStart(2, "0"),
            yyyy = today.getFullYear(),
            nextYear = yyyy + 1,
            dayMonth = "11/30/",
            birthday = dayMonth + yyyy;
        today = mm + "/" + dd + "/" + yyyy;
        //end
    
        const countDown = new Date(birthday).getTime(),
            x = setInterval(function () {
    
                const now = new Date().getTime(),
                    distance = countDown - now;
                    var x = document.querySelectorAll("[class='days']");
                    for (var i = 0;i < x.length; i++) {
                        x[i].innerText = Math.floor(distance / (day))
                    }

                    var x = document.querySelectorAll("[class='hours']");
                    for (var i = 0;i < x.length; i++) {
                        x[i].innerText = Math.floor((distance % (day)) / (hour))
                    }

                    var x = document.querySelectorAll("[class='minutes']");
                    for (var i = 0;i < x.length; i++) {
                        x[i].innerText = Math.floor((distance % (hour)) / (minute))
                    }
                    
                    var x = document.querySelectorAll("[class='seconds']");
                    for (var i = 0;i < x.length; i++) {
                        x[i].innerText = Math.floor((distance % (minute)) / second)
                    }
            }, 0)
    }());
}

el();