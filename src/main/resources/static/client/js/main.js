var swiper = new Swiper(".mySwiper", {
    slidesPerView: 1,
    spaceBetween: 30,
    loop: true,
    autoplay: {
        delay: 3000,
        disableOnInteraction: false,
    },
    pagination: {
        el: ".swiper-pagination",
        clickable: true,
    }
});

//auth-service
$(document).ready(function() {
    $('#togglePassword').click(function() {
        const passwordField = $('#password');
        const passwordFieldType = passwordField.attr('type');
        const toggleIcon = $('#togglePassword');

        if (passwordFieldType === 'password') {
            passwordField.attr('type', 'text');
            toggleIcon.removeClass('fa fa-eye-slash').addClass('fa fa-eye');
        } else {
            passwordField.attr('type', 'password');
            toggleIcon.removeClass('fa fa-eye').addClass('fa fa-eye-slash');

        }
    });

    $('#togglePasswordRegister').click(function() {
        const passwordRegister = $('#registerPassword');
        const passwordRepeatRegister = $('#registerRepeatPassword');
        const passwordFieldType = passwordRegister.attr('type');
        const toggleRegisterIcon = $('#togglePasswordRegister');

        if (passwordFieldType === 'password') {
            passwordRegister.attr('type', 'text');
            passwordRepeatRegister.attr('type', 'text');
            toggleRegisterIcon.removeClass('fa fa-eye-slash').addClass('fa fa-eye');
        } else {
            passwordRegister.attr('type', 'password');
            passwordRepeatRegister.attr('type', 'password');
            toggleRegisterIcon.removeClass('fa fa-eye').addClass('fa fa-eye-slash');

        }
    });
});
//auth-service