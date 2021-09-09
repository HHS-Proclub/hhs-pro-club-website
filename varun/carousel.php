<html>
<head>
  <link rel="stylesheet" type="text/css" href="materialize.css">
</head>
<body>
<p> fish</p>
 <div class="carousel carousel-slider">
    <a class="carousel-item" href="#one!"><img src="http://lorempixel.com/800/400/food/1"></a>
    <a class="carousel-item" href="#two!"><img src="http://lorempixel.com/800/400/food/2"></a>
    <a class="carousel-item" href="#three!"><img src="http://lorempixel.com/800/400/food/3"></a>
    <a class="carousel-item" href="#four!"><img src="http://lorempixel.com/800/400/food/4"></a>
  </div>
</body>
<script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script src="materialize.js"></script>
<script>
  $('.carousel.carousel-slider').carousel({fullWidth: true});
autoplay()   
function autoplay() {
    $('.carousel').carousel('next');
    setTimeout(autoplay, 2000);
}
</script>
</html>