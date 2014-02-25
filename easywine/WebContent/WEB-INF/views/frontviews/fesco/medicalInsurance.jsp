<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@include file="/commons/taglibs.jsp" %>
       
			<div class="panel panel-default">
	  			<div class="panel-heading"></div>
		  			<div class="panel-body">
						<table class="table table-bordered">
							<tr>
							<td>赔付日期</td>
   						    <td>类型</td>
                            <td>索赔额</td>
                            <td>实赔额</td>
                            <td>拒赔原因</td>
                            </tr>
                            <c:forEach items="${mis}" var="mi">
                            	<tr>
                            	<td>${mi.compensate}</td>
   						    	<td>${mi.cType}</td>
                            	<td>${mi.requestCompensate}</td>
                            	<td>${mi.realCompensate}</td>
                            	<td>${mi.reason}</td>
                            	<tr>
                            </c:forEach>
                        </table>
		  			</div>
			</div>
