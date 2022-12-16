var row=1;
var sum=0;
function add(){
    let itemName= document.getElementById("name").value ;
    let itemPrice= document.getElementById("price").value;
    
    if(!itemName || !itemPrice){
        alert("fill all the inputs");
        return;
    }
    var str=document.getElementById("addData");
       var display=str.insertRow(row++);

       var cell1=display.insertCell(0);
       var cell2=display.insertCell(1);
       var cell3=display.insertCell(2);

       cell1.innerHTML=row;
       cell2.innerHTML=itemName;
       cell3.innerHTML=itemPrice;
       var disLast=str.insertRow(row);
      disLast.innerHTML="total "+sum;
     //if you want to add row on top then do not increment the row;
}