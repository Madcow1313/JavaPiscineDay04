#Create directory for compiled objects
mkdir target
#Compile .class files to target
javac -d target ./src/java/edu/school21/printer/app/App.java ./src/java/edu/school21/printer/logic/BmpReader.java
#Copy resources folder
cp -r resources target/
#make archive
jar cfvm target/images-to-chars-printer.jar src/manifest.txt -C target .

#Run application
java -jar target/images-to-chars-printer.jar . O
