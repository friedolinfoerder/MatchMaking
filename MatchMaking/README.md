bockaufbier-server installation instructions
=========================

Setup Python
------------

You need *Python 2.7*.

Install python-dev, build-essential and pip:

	sudo apt-get update
	sudo apt-get install python-dev build-essential python-pip

Install virtualenv
------------------
Navigate to your home directory. Then enter:

	sudo apt-get update
	sudo apt-get install curl
	curl -O https://pypi.python.org/packages/source/v/virtualenv/virtualenv-1.10.1.tar.gz
	tar xvfz virtualenv-1.10.1.tar.gz
	cd virtualenv-1.10.1
	sudo python setup.py install

Create new virtual environment
------------------------------
Navigate to your home directory. Then enter:
	virtualenv bockaufbier-server
	cd bockaufbier-server

Before you continue doing anything: Activate the virtual environment:
	. bin/activate


Clone git repository
--------------------
Navigate to your virtual environment directory. 
*Make sure you have activated your virtual environment (see above).*

Then enter:

	git clone https://KÜRZEL@version.mi.hdm-stuttgart.de/git/MatchMaking

You can rename the "MatchMaking" directory to "src":

	mv MatchMaking src

Install dependencies
--------------------
Navigate to your virtual environment directory. 
*Make sure you have activated your virtual environment (see above).*

Install dependencies:
	
	pip install -r requirements.txt

If you add new dependencies to the project (e.g. using "pip install" to install a new package, like numpy or scipy), you must export the dependencies afterwards:
	
	pip freeze > requirements.txt