<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<html>
    <head>
       <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
       <%@include file="/commons/css.jsp" %>
       <%@include file="/commons/script.jsp" %>
    </head>
    <body style="background:#333333">
       <%@include file="header.jsp" %>
       
    	<div class="container-fulid ">
    	
<!-- 左边布局 -->
        <div class="row">
    
    	<div class="col-xs-8 col-md-8">
    
			<!-- first row -->			
			<div class="row main" style="margin:5px 0 0 15px;">
				<a href="http://www.baidu.com">
				<div class="col-sm-4 col-md-4 col-xs-5 short-block" style="background:#0066FF;">
					<p><i class="fa fa-shopping-cart fa-4x"></i></p>
					<p>财经</p>
				</div>
				</a>
				<div class="col-sm-8 col-md-8 col-xs-7" style="background:#333333;padding: 0 0 0 25px;">
					<div class="row">
						<a href="http://www.baidu.com">
						<div class="col-xs-12 col-sm-12 col-md-12 long-block" style="background:#009933;">
							<i class="fa fa fa-credit-card fa-5x"></i>&nbsp;&nbsp;生活
						</div>
						</a>
					</div>
				</div>
			</div>

			<!-- second row -->
			<div class="row main" style="margin:15px 0 0 15px;">
			<a href="${ctx }/article/list/01">
			<div class="col-sm-4 col-md-4 col-xs-4 short-block" style="background:#339900;">
				<p><i class="fa fa-coffee fa-4x"></i></p>
				<p>项管</p>
			</div>
			</a>
			<div class="col-sm-4 col-md-4 col-xs-4" style="background:#333333;padding: 0 25px 0 25px;">
				<div class="row">
					<a href="${ctx}/article/list/02">
					<div class="col-xs-12 col-sm-12 col-md-12 short-block" style="background:#666633;">
						<p><i class="fa fa-pagelines fa-4x"></i></p>
						<p>人资</p>
					</div>
					</a>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-xs-4" style="background:#333333;padding: 0 0 0 17px;">
				<div class="row">
					<a href="${ctx }/article/list/03">
						<div class="col-xs-12 col-sm-12 col-md-12 short-block" style="background:#6666CC;">
							<p><i class="fa fa-thumbs-up fa-4x"></i></p>
							<p>技术</p>
						</div>
					</a>
				</div>
			</div>
			</div>	
			
			
			<!-- third row -->
			<div class="row main" style="margin:15px 0 67px 15px;">
				<a href="http://www.baidu.com">
				<div class="col-sm-5 col-md-5 col-xs-6 long-block"  style="background:#dd6633;">
					<i class="fa fa fa-file-text fa-4x"></i>&nbsp;&nbsp;趋势
				</div>
				</a>
				
				<div class="col-sm-4 col-md-4 col-xs-6" style="background:#333333;padding: 0 25px 0 25px;">
					<div class="row">
						<a href="http://www.baidu.com">
						<div class="col-xs-6 col-sm-12 col-md-12 short-block" style="background:#FF0033;">
							<p><i class="fa fa-comments-o fa-4x"></i></p>
							<p>英语</p>
						</div>
						</a>
					</div>
				</div>
				
				<div class="col-sm-3 col-md-3 col-xs-12" style="background:#333333;padding: 0 0 0 17px;">
					<div class="row">
						<a href="http://www.baidu.com">
						<div class="col-xs-12 col-sm-12 col-md-12 short-block" style="background:#669999;">
							<p><i class="fa fa-cloud-download fa-4x"></i></p>
							<p>下载</p>
						</div>
						</a>
					</div>
				</div>
			</div>	
			
			
	
		</div>
		<!-- 右边布局 -->
		<div class="col-xs-4 col-md-4">
			<!-- 右边第一行 -->
			<div class="row main-right" style="margin:5px 20px 0 0;" >
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel" >
						  <!-- Indicators -->
						  <ol class="carousel-indicators">
						    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
						    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
						    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
						  </ol>
	
						  <!-- Wrapper for slides -->
						  <div class="carousel-inner">
						    <div class="item active">
						      <img src="${ctx}/images/jake-rocheleau-250.jpg" alt="...">
						      <div class="carousel-caption">
						      </div>
						    </div>
						    <div class="item">
						      <img src="${ctx}/images/jake-rocheleau-250.jpg" alt="...">
						      <div class="carousel-caption">
						      </div>
						    </div>
						    <div class="item">
						      <img src="${ctx}/images/jake-rocheleau-250.jpg" alt="...">
						      <div class="carousel-caption">
						      </div>
						    </div>
						  </div>
				</div>
				
				<!-- Large modal -->
  		<!-- Button trigger modal -->
		<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" style="text-align:center; width:100%; font-size: 2vw;" >蒋泽瑞 Resume</button>

		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">蒋泽瑞——个人简历</h4>
		      </div>
		      <div class="modal-body">
		        <jsp:include page="resume.jsp"></jsp:include>
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
		        <button type="button" class="btn btn-primary">下载保存</button>
		      </div>
		    </div>
		  </div>
		</div>
				
	</div>	
			<!-- 右边第二行 -->		
			<div class="row main-right" style="margin:5px 20px 0 0;">
				<a href="">
				<div class="col-sm-12 col-md-12 col-xs-12 resume-block"  style="background:#FFFFFF;">
					
				</div>
				</a>
				
			</div>	
			
			
			
		</div>
	</div>
</div>
		
		<%@include file="footer.jsp" %>
    </body>
 
</html>