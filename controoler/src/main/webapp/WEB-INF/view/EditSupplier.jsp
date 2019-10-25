<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Supplier</title>
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
<center><h1> EDIT SUPPLIER </h1></center>
<f:form method="post" action="updateSupplier" modelAttribute="addsupplier" >
<table class="table table-borderless">
<tr>
<td>
<h4>ID</h4>
</td>
<td>
<f:input path="id" value="${currproduct.id}" class="form-control"/>

</td>
</tr>
<tr>
<td>
<h4>Enter Supplier Name</h4>
</td>
<td>
<f:input path="suppliername" value="${currproduct.suppliername}"  class="form-control"/>

</td>
</tr>

<tr>
<td>
<h4>Select Supplier Address</h4>
</td>
<td>
<f:input path="supplierAddress" value="${currproduct.supplierAddress}" class="form-control"/>
</td>
</tr>

</table>
<tr>
<td>
<center><input type='submit'  class="btn btn-primary btn-lg" value="Save"/></center>
</td>
</tr>
</f:form>
</body>
</html>