<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html lang="en">
  <head>
  	<link type="text/css" href="${pageContext.request.contextPath}/resources/about.css" rel="stylesheet" />
	<title> Mylayout </title>      
    
  </head>
  <body>  	  		    
		    <div class="navbar">
			  <a href="${pageContext.request.contextPath}/layout/"><i class="fa fa-fw fa-home"></i> Home</a> 
			  <a href="${pageContext.request.contextPath}/layout/""><i class="fa fa-fw fa-search"></i> Search</a> 
			  <a href="${pageContext.request.contextPath}/layout/""><i class="fa fa-fw fa-envelope"></i> Motorcycles</a> 
			  <div class="dropdown">
			  <button onclick="myFunction()" class="dropbtn">Menu</button>
			  
			</div>
			  
			</div>
			<div id="myDropdown" class="dropdown-content">
			    <a href="#">Scooter</a>
			    <a href="#">Chopper</a>
			    <a href="#">Bobber</a>
			</div>
			
            <div class="layout">
                <div class="text1">
                    <p> paragraf 1 Lorem ipsum dolor sit amet consectetur adipisicing elit. Ipsa id quo at, sint velit neque libero! Ea tenetur quaerat, earum a temporibus aliquid fuga architecto, est quo illo, alias dignissimos.</p>
                </div>
                <div class="text2">

                </div>
                <div class="text3">
                    <p>paragraf 2 Lorem ipsum dolor sit amet consectetur adipisicing elit. Exercitationem suscipit, sunt minima odio laudantium consequuntur, aut ipsa temporibus alias iste quidem assumenda corporis illum sequi maxime pariatur numquam! Distinctio, repellat.</p>
                </div>
                <div class="text4">
                    <h1>DESIGNING</h1>
                </div>
               
                <div class="GambarKiri" >
                    <img  src="${pageContext.request.contextPath}/resources/image/${result_page[0][0]}"  class="gbr">
                  
					
                </div>
                
                <div class="JudulKanan">
                        <judul>${result_page[0][2]}</judul>
                        <br>
                        <judul1>ITALY</judul1>
                </div>
                <div class="Isikiri">
                    <div class="Content1">
                        <div class="P1">
                            <div>
                            <p class="isin">Lorem ipsum dolor sit amet consectetur adipisicing elit. Nam ab expedita minus omnis obcaecati a blanditiis sint commodi tempore beatae corporis nemo, alias sit nulla consequatur aperiam eum dolores eaque?</p>
                            </div>
                        </div>
                        <div class="P2">
                            <div>
                            <p class="isin">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Libero, magni a, distinctio ipsa amet harum veniam corporis consequatur sequi tempora hic quo eaque maxime ab, at inventore! Quod, maiores pariatur?</p>
                            </div>
                        </div>
                        <div class="Content2">
                            <div class="isi">
                                <p class="isin">Lorem, ipsum dolor sit amet consectetur adipisicing elit. Veritatis odio quaerat, dicta dolorum ullam </p>
                            </div>
                            <div class="isi">
                                <p class="isin">Lorem ipsum dolor sit amet consectetur adipisicing elit. Labore illo hic accusantium, incidunt perferendis </p>
                            </div>
                        </div>
                        <div class="Content3">
                            <div class="gambar2">
                                <img src="${pageContext.request.contextPath}/resources/image/${result_page[0][1]}" class="gbr1">
                               
                                
                            </div>
                            <div class="isi4">

                            </div>
                            <div class="isi4">
                                    <p class="isin">
                                        Lorem ipsum dolor sit amet consectetur adipisicing elit.
                                    </p>
                            </div>
                        </div>
                    </div>
                </div>
                </div>

       	<footer >
            <div class="footer">
              <p class="footer-content"> Layout &copy; 2018 rathonsamudro<p>
                          
            </div>
        </footer>	    
  </body>
</html>
