package censusanalyser;


import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CensusAnalyserTest {

	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\Mr_Robot\\Desktop\\Fellowship\\IndianStateCensusAnalyser\\lib\\src\\test\\resources\\IndiaStateCensusData.csv";
	private static final String INDIA_CENSUS_WRONG_CSV_FILE_PATH = "C:\\Users\\eclipse-workspace\\CensusAnalyser\\static\\IndiaStateCensusData.csv";

	private static final String INDIA_CENSUS_WRONG_FILE_TYPE_PATH = "C:\\Users\\AB\\eclipse-workspace\\CensusAnalyser\\static\\IndiaStateCensusData.txt";
	private static final String INDIA_CENSUS_WRONG_DELIMITER_FILE_PATH = "C:\\Users\\AB\\eclipse-workspace\\CensusAnalyser\\static\\ IndiaStateCensusData.csv";
	private static final String INDIA_CENSUS_WITHOUT_HEADER_FILE_PATH = "C:\\Users\\AB\\eclipse-workspace\\CensusAnalyser\\static\\IndiaStateCensusDataNoHeader.csv";

	private static final String INDIA_CODE_CSV_FILE_PATH = "C:\\Users\\Mr_Robot\\Desktop\\Fellowship\\IndianStateCensusAnalyser\\lib\\src\\test\\resources\\IndiaStateCode.csv";
	private static final String INDIA_CODE_WRONG_CSV_FILE_PATH = "C:\\Users\\eclipse-workspace\\CensusAnalyser\\static\\IndiaStateCode.csv";

	private static final String INDIA_CODE_WRONG_FILE_TYPE_PATH = "C:\\Users\\AB\\eclipse-workspace\\CensusAnalyser\\static\\IndiaStateCode.txt";
	private static final String INDIA_CODE_WRONG_DELIMITER_FILE_PATH = "C:\\Users\\AB\\eclipse-workspace\\CensusAnalyser\\static\\ IndiaStateCode.csv";
	private static final String INDIA_CODE_WITHOUT_HEADER_FILE_PATH = "C:\\Users\\AB\\eclipse-workspace\\CensusAnalyser\\static\\IndiaStateCodeNoHeader.csv";

	private static CensusAnalyser censusAnalyser;

	@BeforeClass
	public static void createCensusAnalyserObject() {
		censusAnalyser = new CensusAnalyser();
	}

	@Test
	public void givenIndianCensusCSVFileReturnsCorrectRecords() {
		try {

			int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
			assertEquals(29, numOfRecords);
		} catch (CensusAnalyserException e) {
		}
	}

	@Test
	public void givenIndiaCensusData_WithWrongFile_ShouldThrowException() {
		try {

			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_WRONG_CSV_FILE_PATH);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
		}

	}

	@Test
	public void givenIndiaCensusData_WithWrongFileType_ShouldThrowException() {
		try {

			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_WRONG_FILE_TYPE_PATH);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserException.ExceptionType.WRONG_FILE_TYPE, e.type);
		}

	}

	@Test
	public void givenIndiaCensusData_WithWrongFileDelimiter_ShouldThrowException() {
		try {

			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_WRONG_DELIMITER_FILE_PATH);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserException.ExceptionType.NO_SUCH_FILE, e.type);
		}

	}

	@Test
	public void givenIndiaCensusData_WithWrongFileWithNoHeader_ShouldThrowException() {
		try {

			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_WITHOUT_HEADER_FILE_PATH);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserException.ExceptionType.NO_SUCH_FILE, e.type);
		}

	}

	@Test
	public void givenIndianCodeCSVFileReturnsCorrectRecords() {
		try {

			int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CODE_CSV_FILE_PATH);
			assertEquals(37, numOfRecords);
		} catch (CensusAnalyserException e) {
		}
	}

	@Test
	public void givenIndiaCodeData_WithWrongFile_ShouldThrowException() {
		try {

			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.loadIndiaCensusData(INDIA_CODE_WRONG_CSV_FILE_PATH);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
		}

	}

	@Test
	public void givenIndiaCodeData_WithWrongFileType_ShouldThrowException() {
		try {

			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.loadIndiaCensusData(INDIA_CODE_WRONG_FILE_TYPE_PATH);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserException.ExceptionType.WRONG_FILE_TYPE, e.type);
		}

	}

	@Test
	public void givenIndiaCodeData_WithWrongFileDelimiter_ShouldThrowException() {
		try {

			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.loadIndiaCensusData(INDIA_CODE_WRONG_DELIMITER_FILE_PATH);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserException.ExceptionType.NO_SUCH_FILE, e.type);
		}

	}

	@Test
	public void givenIndiaCodeData_WithWrongFileWithNoHeader_ShouldThrowException() {
		try {

			@SuppressWarnings("deprecation")
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(CensusAnalyserException.class);
			censusAnalyser.loadIndiaCensusData(INDIA_CODE_WITHOUT_HEADER_FILE_PATH);
		} catch (CensusAnalyserException e) {
			assertEquals(CensusAnalyserException.ExceptionType.NO_SUCH_FILE, e.type);
		}

	}

}