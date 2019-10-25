<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>SupplierDetails</title>
.errors{
color:red;
}
</head>

<body>
<center><h2>Supplier Details</h2></center>
<f:form method="post" action="addsupplier" modelAttribute="addsupplier">
<table class="table table-borderless">
<tr>
<td>
<h4>Enter Supplier Name</h4>
</td>
<td>
<f:input path="Suppliername" value="${currsupplier.suppliername}"  class="form-control"/>

</td>
</tr>
<tr>
<td>
<h4>Enter Supplier Address</h4>
</td>
<td>
<f:input path="SupplierAddress" value="${currsupplier.SupplierAddress}" class="form-control"/>

</td>
</tr>
</table>
<tr>
<td>
<center><input type='submit' class="btn btn-primary" value="Save"/></center>
</td>
</tr>
</f:form><br><br>
<table class="table table-borderless" >
 <thead class="thead-dark">
<th>
Supplier Name
</th>
<th>
Supplier Address
</th>
<th>Option</th><th>Option</th>
<c:forEach items="${supplierlist}" var="supplier">
<tr>
<td>
${supplier.suppliername}
</td>
<td>
${supplier.supplierAddress}
</td>
<td>
<a type="submit"  class="btn btn-primary" href="SupplierDetails?id=${supplier.id}">Edit</a>
</td>
<td>
<a type="submit"  class="btn btn-primary" href='deletesupplier?id=${supplier.id}'>Delete</a>
</td>
</tr>
</thead>
</c:forEach>
</table>
</body>
</html>