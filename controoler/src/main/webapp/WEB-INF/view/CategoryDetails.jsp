<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Details</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <style>
  .errors{
color:red
}
</style>
  </head>
<body>
<center><h2>Category Details</h2></center>

<f:form method="post" action="addcategory" modelAttribute="addcategory">

<table class="table table-borderless">
<tr>
<td>
<h4>Enter Category id</h4>
</td>
<td>
<f:input path="id" value="${currcategory.id}" class="form-control" />
<f:errors path="id" class="errors"/>
</td>
</tr>
<tr>
<td>
<h4>Enter Category Name</h4>
</td>
<td>
<f:input path="Categoryname" value="${currcategory.categoryname}" class="form-control" />
<f:errors path="Categoryname" class="errors"/>
</td>
</tr>
</table>
<tr>
<td><center>
<input class="btn btn-primary" type='submit' value="Save"/></center>
</td>
</tr>
</f:form><br><br>
<table class="table table-borderless" >
<thead class="thead-dark">
<th>
Category id
</th>
<th>
Category Name
</th>
<th>
Option
</th>
<th>
Option
</th>
<c:forEach items="${categorylist}" var="category">
<tr>
<td>
<h3>${category.id}</h3>
</td>
<td>
<h3>${category.categoryname}</h3>
</td>
<td>
<a type="submit"  class="btn btn-primary" href="CategoryDetails?id=${category.id}">Edit</a>
</td>
<td>
<a type="submit"  class="btn btn-primary" href='deletecategory?id=${category.id}'>Delete</a>
</td>
</c:forEach>
</thead>
</table>

</body>
</html>