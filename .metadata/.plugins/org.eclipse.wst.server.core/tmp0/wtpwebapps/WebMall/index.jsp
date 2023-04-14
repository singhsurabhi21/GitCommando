
<%@page import="java.util.*"%>
<%@page import="com.java.project.connection.Dbcon"%>
<%@page import="com.java.dao.ProductDao"%>
<%@page import="java.util.List"%>
<%@page import="com.java.project.model.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
User auth = (User) request.getSession().getAttribute("auth");
if (auth != null) {
	request.setAttribute("person", auth);
}
ProductDao pd = new ProductDao(Dbcon.getConnection());
List<Product> products = pd.getAllProduct();
ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
if (cart_list != null) {

	request.setAttribute("cart_list", cart_list);
}
%>
<!DOCTYPE html>
<html>
<head>
<%@include file="/includes/head.jsp"%>
<title>WebKart</title>
</head>
<body>
	<%@include file="/includes/navbar.jsp"%>

	<section class="vh-100" style="background-color: #9A616D;">
		<div class="container">

			<div class="card-header my-2 bg-dark text-white">All Products</div>
			<div class="dropdown">
				<button class="btn btn-secondary dropdown-toggle" type="button"
					id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false">Dropdown button</button>
				<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
					<a class="dropdown-item" href="#">Action</a> <a
						class="dropdown-item" href="#">Another action</a> <a
						class="dropdown-item" href="#">Something else here</a>
				</div>
			</div>
			<div class="row">
				<%
				if (!products.isEmpty()) {
					for (Product p : products) {
				%>
				<div class="col-md-3 my-3">
					<div class="card w-100">
						<img  style="height:40vh;" class="card-img-top" src="product_images/<%=p.getImage()%>"
							alt="Card image cap">
						<div class="card-body">
							<h5 class="card-title"><%=p.getName()%></h5>
							<h6 class="price">
								Price:$<%=p.getPrice()%>
							</h6>
							<h6 class="category">
								Category:<%=p.getCategory()%></h6>
							<div class="mt-3 d-flex justify-content-between">
								<a href="add-to-cart?id=<%=p.getId()%>" class="btn btn-dark">Add
									to Cart</a> <a href="order-now?quantity=1&id=<%=p.getId()%>"
									class="btn btn-primary">Buy Now</a>
							</div>
						</div>
					</div>
				</div>
				<%
				}
				} else {
				out.println("There is no products");
				}
				%>

			</div>
		</div>
	</section>

	<%@include file="/includes/footer.jsp"%>
</body>
</html>


