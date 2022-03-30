from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
import smtplib

port = 587 #google's tls port number
server = "smtp.gmail.com" #google's smtp host

senderEmail = "gamers1835@gmail.com" #enter whatever email the message will be sent from here (has to be gmail)
recieverEmail = "gamers1836@gmail.com" #made it my lsr7 email when i was testing. make it any email you want
password = "iansps31"

s = smtplib.SMTP(host=server, port=port)
s.starttls()
s.login(senderEmail, password)

msg = MIMEMultipart() #create message object

messageBody = "google.com/maps/dir/2000+NW+Ashton+Dr,+Blue+Springs,+MO+64015/901+NE+3rd+Street,+Blue+Springs+MO" #content of the message

#setting up the headers for the email
msg['From'] = senderEmail
msg['To'] = recieverEmail
msg['Subject'] = "URL Link Test 2"

msg.attach(MIMEText(messageBody, 'plain')) #link the message contents to the message object

s.send_message(msg) #send the message through the smtp

print("Message successfully delivered...") #lil bit of some good ol' console output

del msg #delete the message object
