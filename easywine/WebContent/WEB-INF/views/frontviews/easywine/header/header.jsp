<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="top-bar">
	<div class="container clearfix">
		<div class="slidedown">
			
			<div class="eight columns">
				<div class="phone-mail">
					<a><i class="icon-phone"></i> Phone : 183 1101 6155</a>
					<a href="javascript:;"><i class="icon-envelope-alt"></i> Mail : 16953767@qq.com</a>
				</div><!-- End phone-mail -->
			</div>
			<div class="eight columns">
				<div class="social">
					<a href="#"><i class="social_icon-twitter s-14"></i></a>
		          	<a href="#"><i class="social_icon-facebook s-18"></i></a>
		           	<a href="#"><i class="social_icon-dribbble s-18"></i></a>
		           	<a href="#"><i class="social_icon-appstore s-18"></i></a>
		           	<a href="#"><i class="social_icon-amazon s-18"></i></a>
		           	<a href="#"><i class="social_icon-rss s-18"></i></a>
				</div>
			</div><!-- End social-icons -->
		          
		</div><!-- End slidedown -->
	</div><!-- End Container -->
</div><!-- End top-bar -->
		     
<div class="main-header">
	<div class="container clearfix">
		<a href="http://localhost:8080/easywine/" class="down-button"><i class="icon-angle-down"></i></a><!-- this appear on small devices -->
		<div class="one-third column">
			<div class="logo">
				<a href="#">
		            <img src="images/logo.png" alt="Invention - Creative Responsive Theme" />
		         </a>
			</div>
		</div><!-- End Logo -->
		         
		<div class="two-thirds column">
			<nav id="menu" class="navigation" role="navigation">
				<a href="http://localhost:8080/easywine/">Show navigation</a><!-- this appear on small devices -->
				<ul id="nav">
					<li <c:if test="${menu_index == 0}"> class="active" </c:if> ><a href="http://localhost:8080/easywine/">首页</a></li>
		            <li <c:if test="${menu_index == 1}"> class="active" </c:if> ><a href="http://localhost:8080/easywine/aboutus">关于我们</a> </li>
					<li <c:if test="${menu_index == 2}"> class="active" </c:if>><a href="">产品</a>
						<ul>
						
							<c:forEach var="menu" items="${menus}">
								<li><a href="http://localhost:8080/easywine/object?type=0,1">${menu.menu_name }</a>
									<c:if test="${menu.sub_menus.size() > 0 }">
				                		<ul>
				                			<c:forEach var="m" items="${menu.sub_menus}">
					    		        		<li><a href="http://localhost:8080/easywine/object?type=2,6">${m.menu_name }</a></li>
				                			</c:forEach>
										</ul>
									</c:if>
			                	</li>
							</c:forEach>
							
		              	</ul>
					</li>
					<li <c:if test="${menu_index == 3}"> class="active" </c:if> ><a href="http://localhost:8080/easywine/blog">论坛</a></li>
		            <li <c:if test="${menu_index == 4}"> class="active" </c:if> ><a href="http://localhost:8080/easywine/contact">联系我们</a></li>
					<li <c:if test="${menu_index == 5}"> class="active" </c:if> ><a href="http://localhost:8080/easywine/joinus">加入我们</a></li>
				</ul>
			</nav>
		</div><!-- End Menu -->
		       
	</div><!-- End Container -->
</div><!-- End main-header -->
		     