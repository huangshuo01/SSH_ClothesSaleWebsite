function preImg(sourceId, targetId) {
	if (typeof FileReader === 'undefined') {
		alert('Your browser does not support FileReader...');
		return;
	}
	var reader = new FileReader();

	reader.onload = function(e) {
		var img = document.getElementById(targetId);
		img.src = this.result;
		img.value = this.result;
	}
	reader.readAsDataURL(document.getElementById(sourceId).files[0]);
}
function SetWinHeight(obj)   
{   
var win=obj;   
if (document.getElementById)   
{   
if (win && !window.opera)   
{   
if (win.contentDocument && win.contentDocument.body.offsetHeight)   
win.height = win.contentDocument.body.offsetHeight;   
else if(win.Document && win.Document.body.scrollHeight)   
win.height = win.Document.body.scrollHeight;   
}   
}   
}   
function login() {
	if (loginfrm.radiobutton1[0].checked == true) {
		loginfrm.action = "Login!customLogin.action"
	}
	if (loginfrm.radiobutton1[1].checked == true) {
		loginfrm.action = "Login!sellerLogin.action"
	}
	if (loginfrm.radiobutton1[2].checked == true) {
		loginfrm.action = "Login!adminLogin.action"
	}
}
function addorder() {
	orderform.action = "OrderServlet?method=addorder"
	alert("successful insert ");
}
function updateorder(){
	alert("successful update ");
}
function deleteorder(){
	alert("successful delete ");
}
function updateinfo() {
	alert("successful update ");
}