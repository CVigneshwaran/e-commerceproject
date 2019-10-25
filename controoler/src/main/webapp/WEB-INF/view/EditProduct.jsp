<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>EDIT PRODUCT</title>
  <style>
  .errors{
color:red
}
</style>
</head>
<body background="black"><center>
<h1>EDIT PRODUCT</h1></center>
<f:form method="post" action="updateproduct" modelAttribute="addproduct" enctype="multipart/form-data">
<table class="table table-borderless"  >
<tr>
<td>
ID
</td>
<td>
<f:input path="productid" value="${currproduct.productid}" class="form-control"/>

</td>
</tr>
<tr>
<td>
Enter Product Name
</td>
<td>
<f:input path="productname" value="${currproduct.productname}" class="form-control"/>

</td>
</tr>
<tr>
<td>
Enter Price
</td>
<td>
<f:input path="price" value="${currproduct.price}" class="form-control"/>
</td>
</tr>
<tr>
<td>
Enter Quantity
</td>
<td>
<f:input path="quantity" value="${currproduct.quantity}" class="form-control"/>

</td>
</tr>
<tr>
<td>
Enter description
</td>
<td>
<f:textarea path="description" value="${currproduct.description}" class="form-control"/>

</td>
</tr>
<tr>
<td>
Select Category Id
</td>
<td>
<f:input path="categoryid" class="form-control"/>
</td>
</tr>
<tr>
<td>
Select Supplier Id
</td>
<td>
<f:input path="supplierid" class="form-control"/>
</td>
</tr>
<tr>
<td>
Select Product Image
</td>
<td>
<input type="file" class="form-control" name="file"/>
</td>
</tr>
</table>
<tr>
<td>
<center><input type='submit' class="btn btn-primary btn-lg" value="Save"/></center>
</td>
</tr>
</f:form>
</body>
</html>