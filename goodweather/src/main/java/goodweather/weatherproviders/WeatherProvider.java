package goodweather.weatherproviders;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by nikita.shubarev@masterdata.ru on 13.11.2017.
 */
public interface WeatherProvider {

  void generateRequestAndResponse(String zipCodes);

  String getError();

  String getServiceSource();

  Map<String, String>[] getWeatherValues();

  String getIcon();

  public Path getForecastFilePath();

  void setIcon(String icon);

  default String parseZipCodes(String zipCodes) {
    zipCodes = zipCodes.replaceAll("\\s*,\\s*", "\u0020").replaceAll("\\s+", "\u0020").trim();

    //System.out.println("|" + zipCodes + "|");

    int longLength = String.valueOf(Long.MAX_VALUE).length();
    String group = "[0-9]{1," + longLength + "}";

    Pattern p = Pattern.compile("(" + group + ")||((" + group + ")(\u0020" + group + ")*)");

    if (p.matcher(zipCodes).matches()) {
      return zipCodes;
    }
    return null;
  }

  default Path csvWriter(String fileName, String[] columns) {

    Path path = Paths.get(System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + fileName);

    try {
      Files.createDirectories(path.getParent());
      Files.deleteIfExists(path);
      Files.createFile(path);
    }
    catch (FileAlreadyExistsException e) {
      System.err.println("File already exists: " + e.getMessage());
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");

    for (int i = 0; i < columns.length - 1; i++) {
      stringBuilder.append(columns[i] + ";");
    }
    stringBuilder.append(columns[columns.length - 1] + "\n");

    try (
      FileWriter fileWriter = new FileWriter(path.toFile());
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
    {
      bufferedWriter.write(stringBuilder.toString());
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    return path;
  }

  default boolean addCsvLine(Path path, String[] values) {

    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("");

    for (int i = 0; i < values.length - 1; i++) {
      stringBuilder.append(values[i] + ";");
    }
    stringBuilder.append(values[values.length - 1] + "\n");

    try (
      FileWriter fileWriter = new FileWriter(path.toFile(), true);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
    {
      bufferedWriter.write(stringBuilder.toString());
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    return true;
  }

  default Path getZipFile(Path path) {

    Path zipFilePath = Paths.get(path.toString() + "." + "zip");

    try {
      Files.createDirectories(zipFilePath.getParent());
      Files.deleteIfExists(zipFilePath);
      Files.createFile(zipFilePath);
    }
    catch (FileAlreadyExistsException e) {
      System.err.println("File already exists: " + e.getMessage());
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    byte[] buffer = new byte[1024];
    try (FileOutputStream outputStream = new FileOutputStream(zipFilePath.toFile());
         ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
         FileInputStream inputStream = new FileInputStream(path.toFile()))
    {

      ZipEntry ze = new ZipEntry(path.toFile().getName());
      zipOutputStream.putNextEntry(ze);

      int len;
      while ((len = inputStream.read(buffer)) > 0) {
        zipOutputStream.write(buffer, 0, len);
      }

      zipOutputStream.closeEntry();
    }
    catch (IOException e) {
      e.printStackTrace();
    }

    return zipFilePath;
  }
}
