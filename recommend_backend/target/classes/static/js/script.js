function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("mySidenav").style.marginLeft = "250px";
  document.getElementById("mySidenav").style.display = "block";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft = "0";
  document.getElementById("mySidenav").style.display = "none";
  document.body.style.backgroundColor = "white";
}

