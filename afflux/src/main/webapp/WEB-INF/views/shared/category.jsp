 <h2>Portfolio Heading</h2>

      
      <div class="row">
      <c:forEach items="${service}" var="services">
      
     <div class="col-lg-4 col-sm-6 portfolio-item">
          <div class="card h-100">
            <a href="#"><img class="card-img-top" src="http://placehold.it/700x400" alt=""></a>
            <div class="card-body">
              <h4 class="card-title">
                <a href="${contextRoot}/show/services/${services.id}/salons" id ="a_${services.name}">${services.name}</a>
              </h4>
              <p class="card-text">${services.description}</p>
            </div>
          </div>
        </div>
     
     
      </c:forEach>
     
      </div>  
     
