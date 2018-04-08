<div class="container">

	<div class="row">

		<!-- for side bar -->
		<div class="col-md-3">

			<%@include file="./shared/category.jsp"%>

		</div>


		<!-- to display salons -->
		<div class="col-md-9">
			<!-- added bread crum component -->
			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllSalons == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home /</a></li>
							<li class="active">All Salons</li>

						</ol>

					</c:if>
					
					
					
					<c:if test="${userClickServiceSalons == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home /</a></li>
							<li class="active"> services /</li>
							<li class="active">${services.name} </li>
						</ol>

					</c:if>

				</div>
			</div>

		</div>


	</div>


</div>