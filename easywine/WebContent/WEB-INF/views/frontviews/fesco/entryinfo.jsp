<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/commons/taglibs.jsp" %>
       
			<div class="panel panel-default">
	  			<div class="panel-heading"></div>
		  			<div class="panel-body">
						<table class="table table-bordered">
							<tr>
							<td>商社名称</td>
   						    <td>商编</td>
                            <td>辅编</td>
                            <td>派出日期</td>
                            <td>派出办理日期</td>
                            </tr>
                            <c:forEach items="${entry}" var="ie">
                            	<tr>
                            	<td>${ie.organization}</td>
   						    	<td>${ie.organizationCode}</td>
                            	<td>${ie.secondCode}</td>
                            	<td>${ie.sendDate}</td>
                            	<td>${ie.entryDate}</td>
                            	<tr>
                            </c:forEach>
                        </table>
		  			</div>
			</div>
