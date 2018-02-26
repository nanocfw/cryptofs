module org.cryptomator.cryptofs {
	exports org.cryptomator.cryptofs;
	exports org.cryptomator.cryptofs.migration;
	exports org.cryptomator.cryptofs.migration.api;

	provides java.nio.file.spi.FileSystemProvider with org.cryptomator.cryptofs.CryptoFileSystemProvider;

	requires org.cryptomator.cryptolib;
	requires org.slf4j;
	requires javax.inject;
	requires dagger;
	requires com.google.common;
}