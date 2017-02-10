package watsonservices.utils.tests;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.IdentifiableLanguage;

public class LanguageTranslationServiceTests {

	private static final LanguageTranslation service = new LanguageTranslation();

	@Test
	public void test() {
		//given
		String username = System.getenv("TRANSLATOR_USERNAME");
		String password = System.getenv("TRANSLATOR_PASSWORD");
		service.setUsernameAndPassword(username, password);
		service.setEndPoint("https://gateway.watsonplatform.net/language-translator/api");

		// when
		List<IdentifiableLanguage> identifieableLanguages = service.getIdentifiableLanguages().execute();

		// then
		assertFalse(identifieableLanguages.isEmpty());
	}

}
