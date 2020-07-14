<!DOCTYPE html> 
<html> 
 
<head> 
 <meta charset="utf-8"> 
 <title>Example of Bootstrap 3 Carousel Events</title> 
 <meta name="viewport" content="width=device-width, initial-scale=1"> 
 <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css"> 
 <!-- Optional Bootstrap theme --> 
 <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css"> 
 
 <style type="text/css"> 
  .carousel { 
   background: #2f4357; 
   margin-top: 20px; 
  } 
   
  .carousel .item img { 
   margin: 0 auto; 
   /* Align slide image horizontally center */ 
  } 
   
  .bs-example { 
   margin: 20px; 
  } 
 </style> 
 
</head> 
 
<body> 
 
 <div class="bs-example"> 
  <div id="myCarousel" class="carousel slide" data-interval="3000" data-ride="carousel"> 
   <!-- Carousel indicators --> 
   <ol class="carousel-indicators"> 
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li> 
    <li data-target="#myCarousel" data-slide-to="1"></li> 
    <li data-target="#myCarousel" data-slide-to="2"></li> 
   </ol> 
   <!-- Wrapper for carousel items --> 
   <div class="carousel-inner"> 
    <div class="active item"> 
     <img src="img/slide1.png" alt="First Slide"> 
     <div class="carousel-caption"> 
      <h3>Second slide label</h3> 
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p> 
     </div> 
    </div> 
    <div class="item"> 
     <img src="img/slide2.png" alt="Second Slide"> 
     <div class="carousel-caption"> 
      <h3>Second slide label</h3> 
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p> 
     </div> 
    </div> 
    <div class="item"> 
     <img src="img/slide3.png" alt="Third Slide"> 
     <div class="carousel-caption"> 
      <h3>Third slide label</h3> 
      <p>Praesent commodo cursus magna, vel scelerisque nisl consectetur.</p> 
     </div> 
    </div> 
   </div> 
   <!-- Carousel controls --> 
   <a class="carousel-control left" href="#myCarousel" data-slide="prev"> 
    <span class="glyphicon glyphicon-chevron-left"></span> 
   </a> 
   <a class="carousel-control right" href="#myCarousel" data-slide="next"> 
    <span class="glyphicon glyphicon-chevron-right"></span> 
   </a> 
  </div> 
 </div> 
 
 <script src="bootstrap/js/jquery.js"></script> 
 <script src="bootstrap/js/bootstrap.js"></script> 
 
 <script type="text/javascript"> 
  $(document).ready(function() 
  { 
   $('#myCarousel').on('slid.bs.carousel', function() 
   { 
    alert("The sliding transition of previous carousel item has been fully completed."); 
   }); 
  }); 
 </script> 
 
</body> 
 
</html><!DOCTYPE html> 
<html> 
 
<head> 
 <meta charset="utf-8"> 
 <title>Example of Bootstrap 3 Accordion</title> 
 <meta name="viewport" content="width=device-width, initial-scale=1"> 
 <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css"> 
 <!-- Optional Bootstrap theme --> 
 <link rel="stylesheet" href="bootstrap/css/bootstrap-theme.css"> 
 
 <style type="text/css"> 
  .bs-example { 
   margin: 20px; 
  } 
 </style> 
 
</head> 
 
<body> 
 
 <div class="bs-example"> 
  <div class="panel-group" id="accordion"> 
   <div class="panel panel-default"> 
    <div class="panel-heading"> 
     <h4 class="panel-title"> 
      <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne">1. What is HTML?</a> 
     </h4> 
    </div> 
    <div id="collapseOne" class="panel-collapse collapse in"> 
     <div class="panel-body"> 
      <p>HTML stands for HyperText Markup Language. HTML is the main markup language for describing the structure of Web pages. <a href="http://www.tutorialrepublic.com/html-tutorial/" target="_blank">Learn more.</a></p> 
     </div> 
    </div> 
   </div> 
   <div class="panel panel-default"> 
    <div class="panel-heading"> 
     <h4 class="panel-title"> 
      <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">2. What is Bootstrap?</a> 
     </h4> 
    </div> 
    <div id="collapseTwo" class="panel-collapse collapse"> 
     <div class="panel-body"> 
      <p>Bootstrap is a powerful front-end framework for faster and easier web development. It is a collection of CSS and HTML conventions. <a href="http://www.tutorialrepublic.com/twitter-bootstrap-tutorial/" target="_blank">Learn more.</a></p> 
     </div> 
    </div> 
   </div> 
   <div class="panel panel-default"> 
    <div class="panel-heading"> 
     <h4 class="panel-title"> 
      <a data-toggle="collapse" data-parent="#accordion" href="#collapseThree">3. What is CSS?</a> 
     </h4> 
    </div> 
    <div id="collapseThree" class="panel-collapse collapse"> 
     <div class="panel-body"> 
      <p>CSS stands for Cascading Style Sheet. CSS allows you to specify various style properties for a given HTML element such as colors, backgrounds, fonts etc. <a href="http://www.tutorialrepublic.com/css-tutorial/" target="_blank">Learn more.</a></p> 
     </div> 
    </div> 
   </div> 
  </div> 
  <p><strong>Note:</strong> Click on the linked heading text to expand or collapse accordion panels.</p> 
 </div> 
 
 <script src="bootstrap/js/jquery.js"></script> 
 <script src="bootstrap/js/bootstrap.js"></script> 
 
 
</body> 
 
</html>
