package org.example.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.example.beans.Imageset;

@HippoEssentialsGenerated(internalName = "hippoplay:newsdocument")
@Node(jcrType = "hippoplay:newsdocument")
public class NewsDocument extends HippoDocument {
	/** 
	 * The document type of the news document.
	 */
	public final static String DOCUMENT_TYPE = "hippoplay:newsdocument";
	private final static String TITLE = "hippoplay:title";
	private final static String DATE = "hippoplay:date";
	private final static String INTRODUCTION = "hippoplay:introduction";
	private final static String IMAGE = "hippoplay:image";
	private final static String CONTENT = "hippoplay:content";
	private final static String LOCATION = "hippoplay:location";
	private final static String AUTHOR = "hippoplay:author";
	private final static String SOURCE = "hippoplay:source";

	/** 
	 * Get the title of the document.
	 * @return the title
	 */
	@HippoEssentialsGenerated(internalName = "hippoplay:title")
	public String getTitle() {
		return getProperty(TITLE);
	}

	/** 
	 * Get the date of the document.
	 * @return the date
	 */
	@HippoEssentialsGenerated(internalName = "hippoplay:date")
	public Calendar getDate() {
		return getProperty(DATE);
	}

	/** 
	 * Get the introduction of the document.
	 * @return the introduction
	 */
	@HippoEssentialsGenerated(internalName = "hippoplay:introduction")
	public String getIntroduction() {
		return getProperty(INTRODUCTION);
	}

	/** 
	 * Get the main content of the document.
	 * @return the content
	 */
	@HippoEssentialsGenerated(internalName = "hippoplay:content")
	public HippoHtml getContent() {
		return getHippoHtml(CONTENT);
	}

	/** 
	 * Get the location of the document.
	 * @return the location
	 */
	@HippoEssentialsGenerated(internalName = "hippoplay:location")
	public String getLocation() {
		return getProperty(LOCATION);
	}

	/** 
	 * Get the author of the document.
	 * @return the author
	 */
	@HippoEssentialsGenerated(internalName = "hippoplay:author")
	public String getAuthor() {
		return getProperty(AUTHOR);
	}

	/** 
	 * Get the source of the document.
	 * @return the source
	 */
	@HippoEssentialsGenerated(internalName = "hippoplay:source")
	public String getSource() {
		return getProperty(SOURCE);
	}

	@HippoEssentialsGenerated(internalName = "hippoplay:image")
	public Imageset getImage() {
		return getLinkedBean("hippoplay:image", Imageset.class);
	}
}
