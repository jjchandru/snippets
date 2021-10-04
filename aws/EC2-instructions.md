# Instructions to create EC2 Instance

1. Search for EC2
1. Click "Instances" in the left hand side menu
1. Click "Launch Instance"
1. Click "Ubuntu Server"
1. Click "Next: Configure Instance Details"
1. Click "Next: Add Storage"
1. Click "Next: Add Tags"
1. Click "Next: Configure Security Group"
1. Click "Review and Launch"
1. Click "Launch"
1. Select "Create a new key pair"
1. Type "Key pair name" as "ec2-example". [Note: This can be any name]
1. Click "Download Key Pair", which will download the file named "ec2-example.pem".
1. In the file explorer go to the "4-DevOps-Hibernate" folder in the "revature-fsd-java" folder.
1. Create a new folder "aws" in "4-DevOps-Hibernate".
1. Create a new folder "ec2" in "aws" folder.
1. Copy and paste the downloaded "ec2-example.pem" into the "ec2" folder.

# Connecting to EC2 instance
1. Open Git Bash in the "ec2" folder.
1. In browser aws site, click on "Instances"
1. Click on the link below "Instance ID"
1. Wait till the status is "Running"
1. Click "Connect"
1. Click "SSH Client"
1. Click the 'copy' icon after "Example" to copy the command
1. Go to Git Bash window opened earlier in the "ec2" folder
1. Paste the command in Git Bash and run it
1. Type "yes" and press enter key which will connect to the EC2 instance

# Linux commands
* There is no drive concept in linux.
* '/' is the root folder.
* When connecting with remote server, we only have command line interface and there is not graphical user interface available.
* Basic linux commands for your reference.
  * `pwd : print working directory`
  * `ls : list files and folders in the current directory`
  * `ls -ltr : list files with more details`
  * `mkdir [folder-name] : create new folder`
  * `cd [folder-name] : change folder`
  * `cat [file-name] : display file content`
  * `nano [file-name] : text file editor`
  * `sudo su - : change to supervisor mode`
