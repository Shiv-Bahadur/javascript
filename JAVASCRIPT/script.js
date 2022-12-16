const apiKey=`062f7284ff5ab894bf1bdad85972dbdf`;


let city=document.getElementById("city");
let submit=document.getElementById("submit");
let temperature=document.getElementById("temperature");
let humidity=document.getElementById("humidity");
let windSpeed=document.getElementById("windSpeed");
let description=document.getElementById("description");
let pressure=document.getElementById("pressure");
let image=document.getElementById("image");
let icon=document.getElementById("icon");

const getWeather= async (city)=>{
    const API=`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apiKey}&units=metric`;
    const response= await fetch(API);
    const data= await response.json();
    console.log(data);
    display(data);
};

let display=(data)=>{
    temperature.innerHTML=data.main.temp+" &#8451;";
    humidity.innerHTML="Humidity: "+data.main.humidity+" %";
    pressure.innerHTML="Pressure: "+data.main.pressure+" hPa";
    windSpeed.innerHTML="Wind speed: "+data.wind.speed+" km/h";
    description.innerHTML=data.weather[0].main;
    icon.innerHTML= `<img src=http://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png>`;
   
}

submit.addEventListener("click",()=>{
    getWeather(city.value);
})

