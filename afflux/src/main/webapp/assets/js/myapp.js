jQuery(document).ready(function($){
	
	var path = window.location.pathname.split("/").pop();
	
	if(path == '')
		{
		path='${contextRoot}/home';
		}
	
	
	var target = $('nav a[href=" '+path+' "]');
	
	target.addClass('active');
	
	
	//solving active menu problem
	/*switch(menu){
	
	
	case 'About us':
		$('#about').addClass('active');
		break;
		
	case 'Contact  us':
		$('#contact').addClass('active');
		break;
		
	default:
		$('#home').addClass('active');
		break;
		
	}*/
	
});