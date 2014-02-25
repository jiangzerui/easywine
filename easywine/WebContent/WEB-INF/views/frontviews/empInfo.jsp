<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

       
			<div class="panel panel-default">
	  			<div class="panel-heading">${employee.name}的基本信息</div>
		  			<div class="panel-body">
		  			<form class="form-horizontal" role="form">
				  		<div class="form-group">
		    				<label class="col-sm-2 control-label">唯一号</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.onlyNum}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">姓名</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.name}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">身份证</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.personID}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">手机</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.phone}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">Email</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.eMail}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">商社名称</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.organization}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">商社编号</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.organizationCode}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">商社辅编</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.oSecondCode}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">开通状态</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${employee.state}</p>
		    				</div>
		  				</div>
		  			</form>
		  			</div>
			</div>
