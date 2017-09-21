var express = require('express');
var app = express();
bodyParser = require('body-parser')

app.use(express.static(__dirname + '/public'));
app.use(bodyParser.urlencoded({
    extended: true
}));

app.get('/',function(req,res){
    res.sendFile('index.html',{'root': __dirname + '/public/index'});
});


app.get('/signIn', function(req, res) {
    res.sendFile('signin.html', {
        'root': __dirname + '/public/signin'
    });
});

app.get('/signUp', function(req, res) {
    res.sendFile('signup.html', {
        'root': __dirname + '/public/signup'
    });
});


app.post('/register', function(req, resp) {
  var _firstName = req.body.inputFirstName;
var _lastName = req.body.inputLastName;
var _username = req.body.inputUsername;
var _password = req.body.inputPassword;
var _phone = req.body.inputPhone;
});

console.log('listening on 3000');
app.listen(3000);