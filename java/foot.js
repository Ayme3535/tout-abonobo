document.addEventListener ("DOMContentLoaded", async()=>{
    let appelApi = await fetch('https://www.scorebat.com/video-api/v3/feed/?token=MTM1NTA0XzE3MDI4OTg5MjhfMTFlZjRhNTgxOTc4NjcyYjhjZjA0YjlhYWFkZDIxMWU2YmY1ZWY2MQ==');
    let data = await appelApi.json();
    console.log(data);

    (document.getElementById("video1")).innerHTML = data.response[29].videos[0].embed ;
    (document.getElementById("video2")).innerHTML = data.response[58].videos[0].embed ;
    (document.getElementById("video3")).innerHTML = data.response[34].videos[0].embed ;
    (document.getElementById("video4")).innerHTML = data.response[51].videos[0].embed ;
    (document.getElementById("video5")).innerHTML = data.response[33].videos[0].embed ;
    (document.getElementById("video6")).innerHTML = data.response[36].videos[0].embed ;     
  });
   
  