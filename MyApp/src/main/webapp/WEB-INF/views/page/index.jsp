<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
<link type="text/css" href="${pageContext.request.contextPath}/resources/styles.css" rel="stylesheet" />
<meta charset="ISO-8859-1">
<title> Mylayout </title>
  </head>
      <body>  	  
		   		    
		    <div class="navbar">
			  <a href="#"><i class="fa fa-fw fa-home"></i> Home</a> 
			  <a href="#"><i class="fa fa-fw fa-search"></i> Search</a> 
			  <a href="#"><i class="fa fa-fw fa-envelope"></i> Motorcycles</a> 
			  <div class="dropdown">
			  <button onclick="myFunction()" class="dropbtn">Menu</button>
			  
			</div>
			  
			</div>
			<div id="myDropdown" class="dropdown-content">
			    <a href="#">Scooter</a>
			    <a href="#">Chopper</a>
			    <a href="#">Bobber</a>
			  </div>
			  
		    <!-- Slideshow container -->
		     <div class="layout">
		    <div class="slideshow-container">	
			    <c:forEach items="${table_page}" var="isi" varStatus="loopStatus">
					  <!-- Full-width images with number and caption text -->
					  <div class="mySlides fade">
					    <div class="numbertext">${loopStatus.count}/ 3 </div>
					    <img class="pict" src="${pageContext.request.contextPath}/resources/image/${isi.picture}" >					    
						<form action="${pageContext.request.contextPath}/detail" method="POST" >
							<input type="hidden" name="name" value="${isi.name}">
					        <input class="button-text" type="submit" value="${isi.name}">				         
				      	</form>	  
					  </div>	
				</c:forEach>
				  <!-- Next and previous buttons -->
				  <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
				  <a class="next" onclick="plusSlides(1)">&#10095;</a>
				  <br>
				  <!-- The dots/circles -->
				<div style="text-align:center">
				  <span class="dot" onclick="currentSlide(1)"></span> 
				  <span class="dot" onclick="currentSlide(2)"></span> 
				  <span class="dot" onclick="currentSlide(3)"></span> 
				</div>
			</div>
				
			<div class="Isikiri">
				<h2 class="tittle-text"> FIND OUT OUR COLLECTION BELOW!</h2>
				<c:forEach items="${table_page_mid}" var="layoutMid" varStatus="loopStatus">
	            	<a class="widget-text" href="${pageContext.request.contextPath}/layout">
	            	 	<h6 class="isi2"> Do you ${layoutMid.name}? Check it Now!</h6>
	            	</a>
	            </c:forEach> 
               </div>
               </div>	 
               <div class="middle-content">                                  
                   <h3 class="middle-content-tittle">Favourite Pages</h3><br>
					   <table border="1">
					      <tr>				         
					         <th>Visited</th>
					         <th>Favourite</th>
					       </tr>
					       <c:forEach items="${table_page}" var="layout" 
					       varStatus="loopStatus">
					          <tr>					             
					             <th>${layout.value}</th>					           
					             <th>${layout.name}</th>
					          </tr>
					       </c:forEach>
					   </table>					
               </div>              
               
               <div class ="bottom-text">
               	<h5>Find out Newest Types :</h5>
	               	<c:forEach items="${table_page_bot}" var="layoutBwh" varStatus="loopStatus">
	               		<ul>
	               		<li style="list-bottom">${layoutBwh.name}</li>	               		
	               		</ul>
	               	</c:forEach>
	               	
	               	
		                           	
               </div> 
			<footer >
			  <div class="footer">
			    <p class="footer-content"> Layout &copy; 2018 rathonsamudro<p>
			    		    
			  </div>
			</footer>
			<script>
			/* When the user clicks on the button, 
			toggle between hiding and showing the dropdown content */
			function myFunction() {
			    document.getElementById("myDropdown").classList.toggle("show");
			}

			// Close the dropdown menu if the user clicks outside of it
			window.onclick = function(event) {
			  if (!event.target.matches('.dropbtn')) {

			    var dropdowns = document.getElementsByClassName("dropdown-content");
			    var i;
			    for (i = 0; i < dropdowns.length; i++) {
			      var openDropdown = dropdowns[i];
			      if (openDropdown.classList.contains('show')) {
			        openDropdown.classList.remove('show');
			      }
			    }
			  }
			}
			
			
			var slideIndex = 1;
			showSlides(slideIndex);

			// Next/previous controls
			function plusSlides(n) {
			  showSlides(slideIndex += n);
			}

			// Thumbnail image controls
			function currentSlide(n) {
			  showSlides(slideIndex = n);
			}

			function showSlides(n) {
			  var i;
			  var slides = document.getElementsByClassName("mySlides");
			  var dots = document.getElementsByClassName("dot");
			  if (n > slides.length) {slideIndex = 1} 
			  if (n < 1) {slideIndex = slides.length}
			  for (i = 0; i < slides.length; i++) {
			      slides[i].style.display = "none"; 
			  }
			  for (i = 0; i < dots.length; i++) {
			      dots[i].className = dots[i].className.replace(" active", "");
			  }
			  slides[slideIndex-1].style.display = "block"; 
			  dots[slideIndex-1].className += " active";
			}
			</script>
  </body>
</html>
