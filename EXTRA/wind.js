// clock implementation
setInterval(time, 1000);
function time() {
    var hour = document.getElementById("hour");
    var min = document.getElementById("min");
    var sec = document.getElementById("sec");
    var ap = document.getElementById("am-pm");

    var d = new Date();
    hour.innerHTML = hours(d);
    sec.innerHTML = seconds(d);
    min.innerHTML = minutes(d);
    ap.innerHTML = apm(d);
}
time();

// date implmntn
function showDate() {
    var days = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];
    var months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"];

    var date = new Date();
    var day = days[date.getDay()];
    var dd = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();
    var mm = months[date.getMonth()];
    var y = (date.getFullYear()) % 100;
    var fdate = day + " " + " " + dd + " " + mm + " " + y;
    document.getElementById("mdate").innerHTML = fdate;

}
showDate();

// country city name
const city = document.getElementById("city-Name");
const country = document.getElementById("country");
city.style.color = "black"; country.style.color = "black";

// for input box styling
function focuss() {
    const dad = document.getElementById("search");
    dad.style.outline = "none"; dad.style.border = "2px solid blue";
}
function blurs() {
    const dad = document.getElementById("search");
    dad.style.border = "none";
}
function onmousehover() {
    document.getElementById("search").style.border = "1px solid blue";
}
function onmouseouts() {
    document.getElementById("search").style.border = "none";
}

// weather data for website
function loadWeather() {
    console.clear();
    const inp = document.getElementById("search");
    // 1st api call
    var apiurl = 'https://api.openweathermap.org/data/2.5/weather?q=' + inp.value + '&units=metric&appid=c406ab908512bab348747aa004b5680c';
    var xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        var info = JSON.parse(this.response);
        console.log(info);
        showData(info);
    }
    xhttp.open('Get', apiurl, true);
    xhttp.send();
    // 2nd api call start from here
    var apiurl2 = 'https://api.openweathermap.org/data/2.5/forecast?q=' + inp.value + '&units=metric&appid=c406ab908512bab348747aa004b5680c';
    var xhttp2 = new XMLHttpRequest();
    xhttp2.onload = function () {
        var info2 = JSON.parse(this.response);
        console.log(info2);
        showData2(info2);
    }
    xhttp2.open('Get', apiurl2, true);
    xhttp2.send();

}

function showData(data) {
    const displayCity = document.getElementById("city-Name");
    const displayCountry = document.getElementById("country");
    displayCity.innerHTML = data.name;
    displayCountry.innerHTML = data.sys.country;
    document.getElementById("lat").innerHTML = data.coord.lat;
    document.getElementById("lon").innerHTML = data.coord.lon;
    document.getElementById("temp").innerHTML = data.main.temp;
    document.getElementById("sunny").innerHTML = data.weather[0].main;
    document.getElementById("minmum").innerHTML = data.main.temp_min;
    document.getElementById("max").innerHTML = data.main.temp_max;
    document.getElementById("windspeed").innerHTML = data.wind.speed + " m/s";
    document.getElementById("humidity").innerHTML = data.main.humidity + " %";
    var srise = new Date(data.sys.sunrise * 1000);
    document.getElementById("rise").innerHTML = hours(srise) + " : " + minutes(srise);
    document.getElementById("srap").innerHTML = " " + apm(srise);
    var sset = new Date(data.sys.sunset * 1000);
    document.getElementById("set").innerHTML = hours(sset) + " : " + minutes(sset);
    document.getElementById("ssap").innerHTML = " " + apm(sset);
    // icon adding
    const mi = document.getElementById("mi");
    const ccv = data.weather[0].icon;
    const icoonurl = "https://openweathermap.org/img/w/" + ccv + ".png";
    mi.setAttribute("src", icoonurl);

}

function showData2(data) {

}

// time functon
function seconds(date) {
    var dates = date.getSeconds();
    dates = dates < 10 ? "0" + dates : dates;
    return dates;
}
function minutes(date) {
    var dates = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
    return dates;
}
function hours(date) {
    var dates = date.getHours();
    if (dates > 12) {
        dates = dates - 12;
    }
    else {
        dates = dates;
    }
    dates = dates < 10 ? "0" + dates : dates;

    return dates;
}
function apm(date) {
    var dates = date.getHours();
    dates = dates > 12 ? "PM" : "AM";
    return dates;
}
// date function for fcast
function fcast(date) {
    var x = date;
    return x;
}

// geoloc
function geo() {
    navigator.geolocation.getCurrentPosition(ff);
    function ff(gg) {
        var lat = gg.coords.latitude;
        var lon = gg.coords.longitude;
        console.log(lat + " " + lon);
        var apiurl = 'https://api.openweathermap.org/data/2.5/weather?lat=' + lat + '&lon=' + lon + '&units=metric&appid=c406ab908512bab348747aa004b5680c';
        var xhttp = new XMLHttpRequest();
        xhttp.onload = function () {
            var info = JSON.parse(this.response);
            console.log(info);
            showData(info);
        }
        xhttp.open('Get', apiurl, true);
        xhttp.send();

    }
}
//  state city select code
var sc = {
    Bihar: ["Select city", "Patna", "Siwan", "Gopalganj", "Chhapra", "Gaya", "Rajgir", "Ara", "Buxur", "Betia"],
    Gujarat: ["Select city", "Surat", "Gandhi Nagar", "Ahmedabad", "Anand", "Vadodra", "Bharuch"],
    UttarPradesh: ["Select city", "Lucknow", "Kanpur", "Gorakhpur", "Aligarh", "Allahabad", "Noida", "Varanasi"],
    MadhyaPradesh: ["Select city", "Bhopal", "Indore", "Jabalpur", "Satna", "Katni", "Maihar", "Ujjain"],
    Maharashtra: ["Select city", "Mumbai", "Pune", "Aurangabad", "Thane"]

}
function selectByCity(city) {
    if (city.length == 0)
        document.getElementById("city-select").innerHTML = "<option>Select city</option>";
    else {
        var op = "";
        for (i in sc[city]) {
            op += "<option>" + sc[city][i] + "</option>";
        }
        document.getElementById("city-select").innerHTML = op;
    }
}
// city selecct wether code
function getWetherByCity(){
    console.clear();
    const gwbc=document.getElementById("city-select");
    var apiurl = 'https://api.openweathermap.org/data/2.5/weather?q=' + gwbc.value + '&units=metric&appid=c406ab908512bab348747aa004b5680c';
    var xhttp = new XMLHttpRequest();
    xhttp.onload = function () {
        var info = JSON.parse(this.response);
        console.log(info);
        showData(info);
    }
    xhttp.open('Get', apiurl, true);
    xhttp.send();
}
