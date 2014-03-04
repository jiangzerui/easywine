<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="ie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
    <head>
    	<meta charset="utf-8">
		<title>CONTACT - EASY WINE | Creative passion Theme</title>
		<meta name="description" content="Here you can find what you need">
		
		<!-- Mobile Specific Metas -->
       	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
		
		<%@include file="/commons/css.jsp" %>
		
		<!--[if lt IE 9]>
			<script src="js/html5.js"></script>
		<![endif]-->
		
		<%@include file="/commons/script.jsp" %>
		
    </head>
	<body>
		<div id="wrap" class="boxed">
			<header>
				<%@include file="./header/header.jsp" %>
		   	</header><!-- <<< End Header >>> -->
		   	
		   	<div class="page-title">
     <div class="container clearfix">
       
       <div class="sixteen columns"> 
         <h1>Contact us</h1>
       </div>
       
     </div><!-- End Container -->
   </div><!-- End Page title -->
   
   <!-- Start Google Map -->
   <div id="map"></div>
   <!-- End -->
   
   <!-- Start main content -->
   <div class="container main-content clearfix">
   
     <div class="eleven columns top-3 bottom-2">
       <h3 class="title bottom-2">Get in touch</h3>
       
       <div id="note"></div><!-- End notification -->
      
      <div id="fields">
      
       <form id="ajax-contact-form" action="">
      
      <div class="form-box">
        <label>Name <small>*</small></label>
        <input type="text" name="name" class="text">
      </div><!-- End Box -->
      
      <div class="form-box">
        <label>Email <small>*</small></label>
        <input type="text" name="email" class="text">
      </div><!-- End Box -->
      
      <div class="form-box last">
        <label>Subject </label>
        <input type="text" name="subject" class="text">
      </div><!-- End Box -->
      
      <div class="form-box big">
        <label>Message <small>*</small></label>
        <textarea name="message"></textarea>
      </div><!-- End Box -->
      
      <div class="clearfix"></div>
      
      <input type="submit" value="Send Message" class="button medium color" />
      
      </form>
      
      </div><!-- End fields -->
      
     </div>
      
     <div class="five columns top-3 bottom-2">
       <h3 class="title bottom-2">Contact Info</h3>
       
       <ul class="address-info">
         <li>30 TF Street, Cairo City, EGYPT</li>
       </ul>
       
       <ul class="phone-info">
         <li>(002) 5605 - 6553 - 9954</li>
       </ul>
       
       <ul class="email-info">
         <li>info@website.com </li>
       </ul>
       
       <h3 class="title top-2 bottom-2">Social Contact</h3>
       <div class="share-social">
      <a href="#" target="_blank"><i class="social_icon-twitter s-17 white"></i></a>
      <a href="#" target="_blank"><i class="social_icon-facebook s-18 white"></i></a>
      <a href="#" target="_blank"><i class="social_icon-dribbble s-18 white"></i></a>
      <a href="#" target="_blank"><i class="social_icon-linkedin s-17 white"></i></a>
      <a href="#" target="_blank"><i class="social_icon-gplus s-18 white"></i></a>
      </div>
       
     </div>
    
   </div><!-- <<< End Container >>> -->
   
		   <footer>
		   		<%@include file="./footer/footer.jsp" %>
			</footer><!-- <<< End Footer >>> -->
		</div><!-- End wrap -->    	
	</body>
</html>
		   	