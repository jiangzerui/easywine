<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<html>
    <head>
       <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
       <%@include file="/commons/fescocss.jsp" %>
       <%@include file="/commons/script.jsp" %>
       	<script type="text/javascript">
       	
		</script>
    </head>
    <body>
    	 <div class="container">
    	 	<div id="common">
    	 		<form action="" method="post">
  					<p>生产商: <input type="text" name="factoryName" /></p>
  					<p>国家: <input type="text" name="countryName" /></p>
  					<p>地区: <input type="text" name="regionName" /></p>
  					<input type="submit" value="Submit" />
				</form>
    	 	</div>
    	 	<div id="load-appearance"></div>
    	 	<div id="load-nose"></div>
    	 	<div id="load-palate"></div>
        	<div id="load-conclustion"></div>
       
         </div>
    </body>
</html>