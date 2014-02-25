<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/commons/taglibs.jsp" %>
<!DOCTYPE html>
<html>
    <head>
       <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
       <%@include file="/commons/fescocss.jsp" %>
       <%@include file="/commons/script.jsp" %>
       	<script type="text/javascript">
       	function getInfo(url,replaceDivId,data,method){
     
       		if(!method||method==''||method==null){
       			method='POST';
       		}
       		if(!data){
       			
       			var inpuVal=$(".form-control").val();
       			if(!inpuVal||inpuVal==''){
       				alert("请输入唯一号");
       				return false;
       			}
       			data=$("#empform").serialize();
       		}
 
       		var request = $.ajax({
  			  url: url,
  			  type: method,
  			  data:data,
  			  dataType: 'html',
  			
	  		});
	  		request.done(function( msg ) {
	  			  $( "#"+replaceDivId ).html( msg );
	  		});
	  			 
	  		request.fail(function( jqXHR, textStatus ) {
	  			  alert( "Request failed: " + textStatus );
	  		});
       	}
       	
         $(function(){
        	 
        	 $("#empform").submit(function(event){
        		getInfo('${ctx}/empInfoBase','load-main',$(this).serialize());
        		event.preventDefault();	 	
        	 });
        	 
         });
		</script>
    </head>
    <body>
    	 <div class="container">
    	 <div class="panel panel-default">
	  	 <div class="panel-heading">FESCO员工信息查询系统</div>
		 <div class="panel-body">
			<nav class="navbar navbar-default" role="navigation">
			  <div class="container-fluid">
			    <div class="navbar-header">
			      <a class="navbar-brand" href="#">员工信息查询</a>
			    </div>
			
			    <!-- Collect the nav links, forms, and other content for toggling -->
			    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
			     <form id="empform" class="navbar-form navbar-left" role="search" method="post">
			        <div class="form-group">
			          <input type="text" class="form-control" name="onlyNum" placeholder="员工唯一号">
			        </div>
			        <button type="submit" class="btn btn-default">Submit</button>
			      </form>
			      <ul class="nav navbar-nav">
			        <li class="active"><a href="#">个人基本信息</a></li>
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown">公积金帐户信息<b class="caret"></b></a>
			          <ul class="dropdown-menu">
			          	<li><a href="javascript:void(0);" onclick="getInfo('${ctx}/accumulationInfo','load-main')">公积金信息</a></li>
			          	<li><a href="#">业务流水</a></li>
			          	<li class="divider"></li>
			            <li><a href="#">委托支取人员信息</a></li>
			            <li><a href="#">委托支取记录</a></li>
			            <li><a href="#">海拉尔支取记录</a></li>
			          </ul>
			        </li>
			        <li class="dropdown">
			          <a href="#" class="dropdown-toggle" data-toggle="dropdown">入离职信息<b class="caret"></b></a>
			          <ul class="dropdown-menu">
			          	<li><a href="javascript:void(0);" onclick="getInfo('${ctx}/entryInfo','load-main')">派出信息</a></li>
			          	<li><a href="javascript:void(0);" onclick="getInfo('${ctx}/dismissionInfo','load-main')">撤离信息</a></li>
			          </ul>
			        </li>
			        <li><a href="javascript:void(0);" onclick="getInfo('${ctx}/medicalRecord','load-main')">医疗报销</a></li>
			        <li><a href="#">社保卡信息</a></li>
			        <li><a href="#">医保实做</a></li>
			      </ul>
			    </div>
			  </div>
			</nav>
		 </div>
    
         </div>
                <div id="load-main"></div>
       
       </div>
    </body>
</html>