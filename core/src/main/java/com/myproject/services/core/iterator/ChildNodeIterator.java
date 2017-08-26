package com.myproject.services.core.iterator;

import javax.jcr.Node;
import javax.jcr.NodeIterator;
//import javax.jcr.sssNodeIterator;
import javax.jcr.RepositoryException;


import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.cq.sightly.WCMUse;

@Component
@Service
@Properties({ 
})

class ChildNodeIterator extends WCMUse
{ 
	
	ResourceResolverFactory rrf ;
	ResourceResolver resolver;

@Override
public void activate() throws RepositoryException 
{
	
	final Logger log=LoggerFactory.getLogger(ChildNodeIterator.class);
	
	log.info("activate method");
	// TODO Auto-generated method stub
	
	Resource resource = resolver.getResource("/content/geometrixx/en");    
	Node node = resource.adaptTo(Node.class);
			 
	NodeIterator iterator = node.getNodes();    
	while (iterator.hasNext()) 
	{    
	Node child = iterator.nextNode();    		   
	log.debug("Child nodes are" + child );	
	//return;
	}
}
}