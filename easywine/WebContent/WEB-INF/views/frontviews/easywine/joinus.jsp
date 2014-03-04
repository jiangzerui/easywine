<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if IE 9 ]><html class="ie ie9" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
    <head>
    	<meta charset="utf-8">
		<title>About us - EASY WINE | Creative passion Theme</title>
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
		         		<h1>welcome to join us</h1>
		       		</div>
       
	     		</div><!-- End Container -->
	   		</div><!-- End Page title -->
		   	
		   	<div class="container main-content clearfix">
		   	
			   	<div class="sixteen columns bottom-3">
	       			
			       	
			       	<form action="#" class="form-elements">
			       	
			       			<h3 class="title bottom-1">产品基本信息 :</h3> 
			       			<div class="sixteen columns clearfix"><hr class="line bottom-3"></div><!-- End line -->
			       			
				          <fieldset>
					          <span>葡萄酒编号 : </span>
					          <input type="text" name="grape_code" value="" />
				          </fieldset>
				          <fieldset>
					          <span>生产商 : </span>
					          <input type="text" name="manufacturer_name" value="" />
				          </fieldset>
				          <fieldset>
				          		<span>品种 : </span>
					          	<select name="grape_id">
					          		<c:forEach var="grape" items="${resMap.grapes }">
							            <option value="${grape.menu_id }">${grape.menu_name }</option>
					          		</c:forEach>
					         	 </select>
				          </fieldset>
				          <fieldset>
					          <span>品尝日期 : </span>
					          <input type="text" name="taste_date" value="" />
				          </fieldset>
				          <fieldset>
					          <span>成本价 : </span>
					          <input type="text" name="buying_price" value="" />
				          </fieldset>
				          
				          <h3 class="title bottom-1">外观 :</h3> 
				          <div class="sixteen columns clearfix"><hr class="line bottom-3"></div><!-- End line -->
				          
				          <fieldset>
					          <span>澄清度 : </span>
					          <c:forEach var="clarity" items="${resMap.clarities }">
						          <input type="radio" name="clarity_id" id="clarity_${clarity.clarityID }"/>
						          		<label for="clarity_${clarity.clarityID }">${clarity.clarityName }</label>
					          </c:forEach>
				          </fieldset>
				           <fieldset>
					          <span>颜色强度 : </span>
					          <c:forEach var="intensity" items="${resMap.intensities }">
						          <input type="radio" name="intensity_id" id="intensity_${intensity.intensityID }"/>
						          <label for="intensity_${intensity.intensityID }">${intensity.intensityName }</label>
					          </c:forEach>
				          </fieldset>
				           <fieldset>
				          		<span>颜色 : </span>
					          	<select name="colour_id">
					          		<c:forEach var="colour" items="${resMap.colours }">
							            <option value="${colour.colourID }">${colour.colourName }</option>
					          		</c:forEach>
					         	 </select>
				          </fieldset>
				          <fieldset>
					          <span>其他描述 : </span>
					          <textarea name="textarea"></textarea>
				          </fieldset>
				          
				          <h3 class="title bottom-1">嗅觉 :</h3> 
				          <div class="sixteen columns clearfix"><hr class="line bottom-3"></div><!-- End line -->
				          
				          <fieldset>
					          <span>状态 : </span>
					          <c:forEach var="condition" items="${resMap.conditions }">
						          <input type="radio" name="condition_id" id="condition_${condition.conditionID }"/>
						          <label for="condition_${condition.conditionID }">${condition.conditionName }</label>
					          </c:forEach>
				          </fieldset>
				          <fieldset>
					          <span>浓郁度 : </span>
					          <c:forEach var="rich" items="${resMap.richs }">
						          <input type="radio" name="rich_id" id="rich_${rich.intensityID }"/>
						          <label for="rich_${rich.intensityID }">${rich.intensityName }</label>
					          </c:forEach>
				          </fieldset>
				          <fieldset>
					          <span>香气特征 : </span>
					          <c:forEach var="flavour" items="${resMap.flavours }">
						          <input type="checkbox" id="flavour_${flavour.flavourID }" value="flavour_id"/>
						          <label for="flavour_${flavour.flavourID }">${flavour.flavourName }</label>
					          </c:forEach>
				          </fieldset>
				          
				          <h3 class="title bottom-1">味觉 :</h3> 
				          <div class="sixteen columns clearfix"><hr class="line bottom-3"></div><!-- End line -->
				          
				          <fieldset>
					          <span>甜度 : </span>
					          <c:forEach var="sweet" items="${resMap.sweetnesses }">
						          <input type="radio" name="sweetness_id" id="sweetness_${sweet.sweetnessID }"/>
						          <label for="sweetness_${sweet.sweetnessID }">${sweet.sweetnessName }</label>
					          </c:forEach>
				          </fieldset>
				          <fieldset>
					          <span>酸度 : </span>
					          <c:forEach var="acidity" items="${resMap.acidities }">
						          <input type="radio" name="acidity_id" id="acidity_${acidity.acidityID }"/>
						          <label for="acidity_${acidity.acidityID }">${acidity.acidityName }</label>
					          </c:forEach>
				          </fieldset>
				          <fieldset>
					          <span>单宁酸 : </span>
					          <c:forEach var="tannin" items="${resMap.tannins }">
						          <input type="radio" name="tannin_id" id="tannin_${tannin.tanninID }"/>
						          <label for="tannin_${tannin.tanninID }">${tannin.tanninName }</label>
					          </c:forEach>
				          </fieldset>
				          <fieldset>
					          <span>酒体 : </span>
					          <input type="text" name="grape_code" value="" />
				          </fieldset>
				           <fieldset>
					          <span>风味特征 : </span>
					          <c:forEach var="relish" items="${resMap.relishs }">
						          <input type="checkbox" id="relish_${relish.flavourID }" name="relish_id"/>
						          <label for="relish_${relish.flavourID }">${relish.flavourName }</label>
					          </c:forEach>
				          </fieldset>
				           <fieldset>
					          <span>回味 : </span>
					          <c:forEach var="finish" items="${resMap.finishs }">
						          <input type="radio" name="finish_id" id="finish_${finish.finishID }"/>
						          <label for="finish_${finish.finishID }">${finish.finishName }</label>
					          </c:forEach>
				          </fieldset>
				          <fieldset>
					          <span>其他描述 : </span>
					          <textarea name="textarea"></textarea>
				          </fieldset>
				          
				          <h3 class="title bottom-1">结论 :</h3> 
				          <div class="sixteen columns clearfix"><hr class="line bottom-3"></div><!-- End line -->
				          
				          <fieldset>
					          <span>品质 : </span>
					          <c:forEach var="quality" items="${resMap.qualities }">
						          <input type="radio" name="quality_id" id="quality_${quality.qualityID }"/>
						          <label for="radio_${quality.qualityID }">${quality.qualityName }</label>
					          </c:forEach>
				          </fieldset>
				          
				          
					</form>
			     </div><!-- End who we are -->
		   	
		   	</div>
		   	
		   	
		   	
		   <footer>
		   		<%@include file="./footer/footer.jsp" %>
			</footer><!-- <<< End Footer >>> -->
		</div><!-- End wrap -->    	
	</body>
</html>
		   	