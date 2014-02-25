<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

       
			<div class="panel panel-default">
	  			<div class="panel-heading">${accumulation.personName}公积金账户信息</div>
		  			<div class="panel-body">
		  			<form class="form-horizontal" role="form">
				  		<div class="form-group">
		    				<label class="col-sm-2 control-label">住房管理部</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.houseCenter}(${accumulation.houseCenterCode})</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">单位登记证</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.houseCenterNo}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">个人编号</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.onlyNum}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">姓名</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.personName}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">证件号码</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.personID}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">商社名称</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.organization}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">当前余额</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.accountBlanace}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">本年缴存</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.deposit}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">本年提取</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.withdraw}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">上年结转</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.forwardBlanace}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">上年提取</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.lastYearExtration}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">利息</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.interest}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">下一缴存月</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.nextDepositDate}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">状态</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.status}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">开户行</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.bankName}</p>
		    				</div>
		  				</div>
		  				
		  				<div class="form-group">
		    				<label class="col-sm-2 control-label">银行账号</label>
		    				<div class="col-sm-10">
		      						<p class="form-control-static">${accumulation.bankAccount}</p>
		    				</div>
		  				</div>
		  			</form>
		  			</div>
			</div>
