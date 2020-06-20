# aliveWhen function
# Takes a date and returns which authors were alive at that date
# Output is not 100% accurate, due to the data set having lots
# of instances where the date of birth is 0 (for various reasons)



aliveWhen <- function(date){
  for(i in 1:(nrow(data))){
    if(date<data[[i,"bibliography.author.death"]] && date>data[[i,"bibliography.author.birth"]] && author.info(i, data)$Age <120){
      print(as.character(data[[i,"bibliography.author.name"]]))
    }
  }
}

