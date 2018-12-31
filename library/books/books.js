const express=require("express");
const app=express();
const bodyParser = require("body-parser");

app.use(bodyParser.json());

app.get('/',(req,res)=>{
    res.send("This is the books services");
})
//for loading mongoose
const mongoose=require("mongoose");

require("./Book")
const Book=mongoose.model("Book")
//for connection with mongoose
mongoose.connect("mongodb://vijay:vijay123@ds161890.mlab.com:61890/booksservice57",()=>{
    console.log("Database is created");
});

//create func
app.post("/book",(req,res)=>{
     var newBook={
         title:req.body.title,
         author:req.body.author,
         numberPages:req.body.numberPages,
         publisher:req.body.publisher
     }
      var book=new Book(newBook)
      book.save().then(()=>{
          console.log("New book created!")

      }).catch((err)=>{
          if(err){
              throw err;
          }
      })
     res.send("a new book created with success!")
})

app.listen(4745,()=>{
    console.log("Up and down!--this is our books service");
})
