package jp.nephy.tweetstorm.session

import io.ktor.http.Parameters
import jp.nephy.tweetstorm.Config
import jp.nephy.tweetstorm.fetcher
import java.io.Writer
import java.util.concurrent.TimeUnit

class AuthenticatedStream(writer: Writer, query: Parameters, val account: Config.Account): Stream(writer, query) {
    override fun handle() {
        fetcher.start(this)
    }
}
