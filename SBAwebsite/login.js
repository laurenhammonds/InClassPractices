function validateLogin() {
    e.preventDefault();
    console.log("form submitted");

    let name = document.getElementById("nameId");
    let username = document.getElementById("userId");
    let password = document.getElementById("passId");
    let phone = document.getElementById("phoneId");

    if ( name.value == "" ) {
        name.classList.add('error-field');
    }

    if ( username.value == "" ) {
        username.classList.add('error-field');
    }

    if ( password.value == "" ) {
        password.classList.add('error-field');
    }

   if ( ! phone.value.match(/[0-9]{3}[-\s\.]*[0-9]{3}\s*[0-9]{4}/gm)) {
        phone.classList.add('error-field');
   }
    
}