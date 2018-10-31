//
//
//Author:William Zhang
public class StudentInformation implements java.io.Serializable
{
	private String studentNumber=null;
	private String studentName=null;
	private char studentSex=0;
	private String studentMajor=null;
	
	StudentInformation(){};
	public String getStudentNumber(){
	return studentNumber;}
	public String getStudentName(){
	return studentName;}
	public char getStudentSex(){
	return studentSex;}
	public String getStudentMajor(){
	return studentMajor;}
    public void setStudentNumber(String studentNumber){
	this.studentNumber=studentNumber;}
	public void setStudentName(String studentName){
	this.studentName=studentName;}
	public void setStudentSex(char studentSex){
	this.studentSex=studentSex;}
	public void setStudentMajor(String studentMajor){
	this.studentMajor=studentMajor;}
}